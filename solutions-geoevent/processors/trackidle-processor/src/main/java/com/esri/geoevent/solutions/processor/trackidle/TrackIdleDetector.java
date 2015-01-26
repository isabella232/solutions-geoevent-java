package com.esri.geoevent.solutions.processor.trackidle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.esri.core.geometry.Geometry.Type;
import com.esri.core.geometry.GeometryEngine;
import com.esri.core.geometry.MapGeometry;
import com.esri.core.geometry.Point;
import com.esri.ges.core.ConfigurationException;
import com.esri.ges.core.component.ComponentException;
import com.esri.ges.core.geoevent.DefaultFieldDefinition;
import com.esri.ges.core.geoevent.DefaultGeoEventDefinition;
import com.esri.ges.core.geoevent.FieldDefinition;
import com.esri.ges.core.geoevent.FieldException;
import com.esri.ges.core.geoevent.FieldType;
import com.esri.ges.core.geoevent.GeoEvent;
import com.esri.ges.core.geoevent.GeoEventDefinition;
import com.esri.ges.core.geoevent.GeoEventPropertyName;
import com.esri.ges.core.validation.ValidationException;
import com.esri.ges.framework.i18n.BundleLogger;
import com.esri.ges.framework.i18n.BundleLoggerFactory;
import com.esri.ges.manager.geoeventdefinition.GeoEventDefinitionManager;
import com.esri.ges.messaging.GeoEventCreator;
import com.esri.ges.messaging.Messaging;
import com.esri.ges.messaging.MessagingException;
import com.esri.ges.processor.GeoEventProcessorBase;
import com.esri.ges.processor.GeoEventProcessorDefinition;
import com.esri.ges.util.Converter;
import com.esri.ges.util.Validator;

public class TrackIdleDetector extends GeoEventProcessorBase {
	private static final BundleLogger LOGGER = BundleLoggerFactory
			.getLogger(TrackIdleDetector.class);

	private TrackIdleNotificationMode notificationMode;
	private long idleLimit;
	private GeoEventCreator geoEventCreator;
	private GeoEventDefinitionManager manager;
	private String outDefName;
	private long tolerance;
	private Boolean keepFields;
	private List<FieldDefinition> fds;
	private final Map<String, TrackIdleStart> trackIdles = new ConcurrentHashMap<String, TrackIdleStart>();

	protected TrackIdleDetector(GeoEventProcessorDefinition definition)
			throws ComponentException {
		super(definition);
	}

	public void afterPropertiesSet() {
		notificationMode = Validator.valueOfIgnoreCase(
				TrackIdleNotificationMode.class,
				getProperty("notificationMode").getValueAsString(),
				TrackIdleNotificationMode.OnChange);
		idleLimit = Converter.convertToInteger(getProperty("idleLimit")
				.getValueAsString(), 300);
		tolerance = Converter.convertToLong(getProperty("tolerance")
				.getValueAsString(), 50l);
		keepFields = (Boolean) getProperty("keepfields").getValue();
		outDefName = getProperty("outdefname").getValueAsString();
		// GeoEventDefinition ged = new DefaultGeoEventDefinition();
		// 
		fds = new ArrayList<FieldDefinition>();
		try {
			fds.add(new DefaultFieldDefinition("trackId", FieldType.String,
					"TRACK_ID"));
			fds.add(new DefaultFieldDefinition("idle", FieldType.Boolean));
			fds.add(new DefaultFieldDefinition("idleDuration", FieldType.Double));
			fds.add(new DefaultFieldDefinition("idleStart", FieldType.Date));
			fds.add(new DefaultFieldDefinition("geometry", FieldType.Geometry));
			// ged.setFieldDefinitions(fds);
		} catch (ConfigurationException e) {

		}

		// geoEventDefinitions.put(ged.getName(), ged);
	}

	@Override
	public GeoEvent process(GeoEvent geoEvent) throws Exception {
		return processGeoEvent(geoEvent);
	}

	@Override
	public void validate() throws ValidationException {
		super.validate();
		List<String> errors = new ArrayList<String>();
		if (idleLimit <= 0)
			errors.add(LOGGER.translate("VALIDATION_GAP_DURATION_INVALID",
					definition.getName()));

		if (errors.size() > 0) {
			StringBuffer sb = new StringBuffer();
			for (String message : errors)
				sb.append(message).append("\n");
			throw new ValidationException(LOGGER.translate("VALIDATION_ERROR",
					this.getClass().getName(), sb.toString()));
		}
	}

	private GeoEvent processGeoEvent(GeoEvent geoEvent) {
		GeoEvent geoevent = null;
		GeoEventDefinition ged = null;
		if((ged=manager.searchGeoEventDefinition(outDefName, getId()))==null)
		{
			if (keepFields) {
				GeoEventDefinition eventDef = geoEvent.getGeoEventDefinition();
				try {
					ged = eventDef.augment(fds);
				} catch (ConfigurationException e) {
					LOGGER.error(e.getLocalizedMessage());
				}
			} else {
				ged = new DefaultGeoEventDefinition();
				ged.setFieldDefinitions(fds);
			}
			ged.setName("TrackIdle");
		}
		
		if (geoEvent.getTrackId() == null || geoEvent.getGeometry() == null) {
			LOGGER.warn("NULL_ERROR");
			return null;
		}
		if (trackIdles == null) {
			LOGGER.warn("TRACK_IDLES_NULL");
			return null;
		}
		try {
			String cacheKey = buildCacheKey(geoEvent);
			TrackIdleStart idleStart = trackIdles.get(cacheKey);
			if (idleStart != null && idleStart.getGeometry() != null) {
				if (!hasGeometryMoved(geoEvent.getGeometry(),
						idleStart.getGeometry(), tolerance)) {
					double idleDuration = (geoEvent.getStartTime().getTime() - idleStart
							.getStartTime().getTime()) / 1000.0;
					idleDuration = idleDuration >= 0 ? idleDuration
							: -idleDuration;
					idleDuration = Math.round(idleDuration * 10.0) / 10.0;
					if (idleDuration >= idleLimit) {
						idleStart.setIdleDuration(idleDuration);
						if (keepFields) {
							if (notificationMode == TrackIdleNotificationMode.Continuous)
								geoevent = createTrackIdleGeoEvent(idleStart,
										true, geoEvent);
							else if (!idleStart.isIdling())
								geoevent = createTrackIdleGeoEvent(idleStart,
										true, geoEvent);
							idleStart.setIdling(true);
						} else {
							if (notificationMode == TrackIdleNotificationMode.Continuous)
								geoevent = createTrackIdleGeoEvent(idleStart,
										true);
							else if (!idleStart.isIdling())
								geoevent = createTrackIdleGeoEvent(idleStart,
										true);
							idleStart.setIdling(true);
						}
					}
				} else {
					if (idleStart.isIdling()) {
						geoevent = createTrackIdleGeoEvent(idleStart, false);
					}
					idleStart.setGeometry(geoEvent.getGeometry());
					idleStart.setStartTime(geoEvent.getStartTime());
					idleStart.setIdling(false);
				}
			} else {
				trackIdles.put(
						cacheKey,
						new TrackIdleStart(geoEvent.getTrackId(), geoEvent
								.getStartTime(), geoEvent.getGeometry()));
			}
		} catch (Exception error) {
			LOGGER.error(error.getMessage(), error);
		}
		return geoevent;
	}

	private boolean hasGeometryMoved(MapGeometry geom1, MapGeometry geom2,
			double tolerance) {
		if (geom1 != null && geom1.getGeometry() != null
				&& geom1.getGeometry().getType() == Type.Point && geom2 != null
				&& geom2.getGeometry() != null
				&& geom2.getGeometry().getType() == Type.Point) {
			Point corePt1 = (Point) geom1.getGeometry();
			Point corePt2 = (Point) geom2.getGeometry();
			double meters = 0.0;
			try {
				meters = GeometryEngine.geodesicDistanceOnWGS84(corePt1,
						corePt2);
			} catch (Throwable error) {
				LOGGER.error(error.getMessage());
			}

			double feet = meter2feet(meters);
			if (feet >= tolerance)
				return true;
			else
				return false;
		} else {
			throw new RuntimeException(
					LOGGER.translate("INVALID_GEOMETRY_TYPE"));
		}
	}

	private double meter2feet(double meter) {
		return meter * 3.28084;
	}

	private GeoEvent createTrackIdleGeoEvent(TrackIdleStart idleStart,
			boolean isIdle) throws MessagingException {
		GeoEvent idleEvent = null;
		if (geoEventCreator != null) {
			try {
				idleEvent = geoEventCreator.create("TrackIdle", definition
						.getUri().toString());
				idleEvent.setField(0, idleStart.getTrackId());
				idleEvent.setField(1, isIdle);
				idleEvent.setField(2, idleStart.getIdleDuration());
				idleEvent.setField(3, idleStart.getStartTime());
				idleEvent.setField(4, idleStart.getGeometry());
				idleEvent.setProperty(GeoEventPropertyName.TYPE, "event");
				idleEvent.setProperty(GeoEventPropertyName.OWNER_ID, getId());
				idleEvent.setProperty(GeoEventPropertyName.OWNER_URI,
						definition.getUri());
			} catch (FieldException error) {
				idleEvent = null;
				LOGGER.error("GEOEVENT_CREATION_ERROR", error.getMessage());
				LOGGER.info(error.getMessage(), error);
			}
		}
		return idleEvent;
	}

	private GeoEvent createTrackIdleGeoEvent(TrackIdleStart idleStart,
			boolean isIdle, GeoEvent oEvent) throws MessagingException {
		GeoEvent idleEvent = null;
		if (geoEventCreator != null) {
			try {
				idleEvent = geoEventCreator.create("TrackIdle", definition
						.getUri().toString());
				idleEvent.setField("trackId", idleStart.getTrackId());
				idleEvent.setField("idle", isIdle);
				idleEvent.setField("idleDuration", idleStart.getIdleDuration());
				idleEvent.setField("idleStart", idleStart.getStartTime());
				idleEvent.setField("GEOMETRY", idleStart.getGeometry());
				for (FieldDefinition fd : oEvent.getGeoEventDefinition()
						.getFieldDefinitions()) {
					if (!(fd.getTags().contains("GEOMETRY") && fd.getTags()
							.contains("TRACK_ID"))) {
						idleEvent.setField(fd.getName(),
								oEvent.getField(fd.getName()));
					}
				}
				idleEvent.setProperty(GeoEventPropertyName.TYPE, "event");
				idleEvent.setProperty(GeoEventPropertyName.OWNER_ID, getId());
				idleEvent.setProperty(GeoEventPropertyName.OWNER_URI,
						definition.getUri());
			} catch (FieldException error) {
				idleEvent = null;
				LOGGER.error("GEOEVENT_CREATION_ERROR", error.getMessage());
				LOGGER.info(error.getMessage(), error);
			}
		}
		return idleEvent;
	}

	private String buildCacheKey(GeoEvent geoEvent) {
		if (geoEvent != null && geoEvent.getTrackId() != null) {
			GeoEventDefinition definition = geoEvent.getGeoEventDefinition();
			return definition.getOwner() + "/" + definition.getName() + "/"
					+ geoEvent.getTrackId();
		}
		return null;
	}

	public void setMessaging(Messaging messaging) {
		geoEventCreator = messaging.createGeoEventCreator();
	}
	
	public void setManager(GeoEventDefinitionManager manager)
	{
		this.manager = manager;
	}
}
