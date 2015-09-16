package com.esri.geoevent.solutions.processor.ll2mgrs;

import java.util.ArrayList;
import java.util.List;

import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.MapGeometry;
import com.esri.core.geometry.Point;
import com.esri.core.geometry.Polygon;
import com.esri.core.geometry.SpatialReference;
import com.esri.ges.core.ConfigurationException;
import com.esri.ges.core.component.ComponentException;
import com.esri.ges.core.geoevent.DefaultFieldDefinition;
import com.esri.ges.core.geoevent.FieldDefinition;
import com.esri.ges.core.geoevent.FieldType;
import com.esri.ges.core.geoevent.GeoEvent;
import com.esri.ges.core.geoevent.GeoEventDefinition;
import com.esri.ges.core.geoevent.GeoEventPropertyName;
import com.esri.ges.manager.geoeventdefinition.GeoEventDefinitionManager;
import com.esri.ges.messaging.GeoEventCreator;
import com.esri.ges.messaging.Messaging;
import com.esri.ges.processor.GeoEventProcessorBase;
import com.esri.ges.processor.GeoEventProcessorDefinition;

public class LatLongProcessor extends GeoEventProcessorBase {
	private GeoEventDefinitionManager manager;
	public Messaging messaging;
	private Integer accuracy;
	private String newdef;
	private String geofld;
	private String mgrs;
	private Boolean overwrite;
	private List<FieldDefinition> fds;

	public LatLongProcessor(GeoEventProcessorDefinition definition)
			throws ComponentException {
		super(definition);
		// TODO Auto-generated constructor stub
	}

	public void setManager(GeoEventDefinitionManager manager) {
		this.manager = manager;
	}

	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
	}
	
	@Override
	public boolean isGeoEventMutator() {
		return true;
	}

	@Override
	public void afterPropertiesSet() {
		mgrs = properties.get("mgrs").getValueAsString();
		overwrite = (Boolean) properties.get("overwrite").getValue();
		if (overwrite)
			geofld = "GEOMETRY";
		else {
			geofld = properties.get("geofld").getValueAsString();
			try {
				FieldDefinition fd = new DefaultFieldDefinition("mgrs",
						FieldType.String);
				fds = new ArrayList<FieldDefinition>();
				fds.add(fd);
			} catch (ConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		newdef = properties.get("eventdef").getValueAsString();
		accuracy = (Integer) properties.get("accuracy").getValue();
		try {
			FieldDefinition fd = new DefaultFieldDefinition("mgrs",
					FieldType.String);
			fds = new ArrayList<FieldDefinition>();
			fds.add(fd);
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public GeoEvent process(GeoEvent evt) throws Exception {
		MGRS2LatLongConverter converter = new MGRS2LatLongConverter();
		LL ll = converter.MGRS2LL(mgrs);
		GeoEvent geOut = null;
		MapGeometry mapGeo = null;
		BoundingBox bb = ll.getBoundingBox();
		if (bb != null) {
			Polygon geo = new Polygon();

			double xmin = bb.getXMin();
			double ymin = bb.getYMin();
			double xmax = bb.getXMax();
			double ymax = bb.getYMax();
			Point lowerleft = new Point(xmin, ymin);
			Point upperleft = new Point(xmin, ymax);
			Point upperright = new Point(xmax, ymax);
			Point lowerright = new Point(xmax, ymin);
			geo.startPath(lowerleft);
			geo.lineTo(upperleft);
			geo.lineTo(upperright);
			geo.lineTo(lowerright);
			geo.closeAllPaths();
			mapGeo = new MapGeometry(geo,
					SpatialReference.create(4326));

		} else {
			
			double x = ll.getLon();
			double y = ll.getLat();
			Point pt = new Point(x,y);
			mapGeo = new MapGeometry(pt,
					SpatialReference.create(4326));
		}
		if (!overwrite) {
			GeoEventDefinition edOut;
			GeoEventDefinition geoDef = evt.getGeoEventDefinition();
			if ((edOut = manager.searchGeoEventDefinition(newdef, getId())) == null) {
				edOut = geoDef.augment(fds);
				edOut.setOwner(getId());
				edOut.setName(newdef);
				manager.addGeoEventDefinition(edOut);
				GeoEventCreator geoEventCreator = messaging
						.createGeoEventCreator();
				geOut = geoEventCreator.create(edOut.getGuid(),
						new Object[] { evt.getAllFields(), mgrs });
				geOut.setProperty(GeoEventPropertyName.TYPE, "message");
				geOut.setProperty(GeoEventPropertyName.OWNER_ID, getId());
				geOut.setProperty(GeoEventPropertyName.OWNER_ID,
						definition.getUri());
				geOut.setField(geofld, mapGeo);
			}
		} else {
				geOut = evt;
				geOut.setGeometry(mapGeo);
			}
		
		return geOut;
	}

}
