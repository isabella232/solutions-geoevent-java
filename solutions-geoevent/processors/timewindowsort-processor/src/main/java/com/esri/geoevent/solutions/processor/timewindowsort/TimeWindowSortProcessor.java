package com.esri.geoevent.solutions.processor.timewindowsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import com.esri.ges.core.component.ComponentException;
import com.esri.ges.core.geoevent.FieldDefinition;
import com.esri.ges.core.geoevent.FieldException;
import com.esri.ges.core.geoevent.FieldType;
import com.esri.ges.core.geoevent.GeoEvent;
import com.esri.ges.core.geoevent.GeoEventCache;
import com.esri.ges.core.geoevent.GeoEventDefinition;
import com.esri.ges.core.validation.ValidationException;
import com.esri.ges.manager.geoeventdefinition.GeoEventDefinitionManager;
import com.esri.ges.messaging.EventDestination;
import com.esri.ges.messaging.EventUpdatable;
import com.esri.ges.messaging.GeoEventCreator;
import com.esri.ges.messaging.GeoEventProducer;
import com.esri.ges.messaging.Messaging;
import com.esri.ges.messaging.MessagingException;
import com.esri.ges.processor.CacheEnabledGeoEventProcessor;
import com.esri.ges.processor.GeoEventProcessorBase;
import com.esri.ges.processor.GeoEventProcessorDefinition;

public class TimeWindowSortProcessor extends GeoEventProcessorBase implements
		Runnable, GeoEventProducer, EventUpdatable {
	private boolean monitoring = false;
	private boolean running = false;
	private Integer interval;
	private String sortfield;
	private SortedMap<Object, ArrayList<GeoEvent>> sorted = new TreeMap<Object, ArrayList<GeoEvent>>();
	private GeoEventCreator geoEventCreator;
	private GeoEventDefinitionManager manager;
	private Messaging messaging;
	private GeoEventProducer geoEventProducer;
	private long timestamp;
	private Thread t;

	public TimeWindowSortProcessor(GeoEventProcessorDefinition definition)
			throws ComponentException {
		super(definition);
	}

	@Override
	public void send(GeoEvent geoEvent) throws MessagingException {
		if (geoEventProducer != null && geoEvent != null)
			geoEventProducer.send(geoEvent);
	}

	@Override
	public void setId(String id) {
		super.setId(id);
		geoEventProducer = messaging
				.createGeoEventProducer(new EventDestination(id + ":event"));
	}

	@Override
	public void afterPropertiesSet() {
		interval = (Integer) properties.get("interval").getValue();
		sortfield = properties.get("orderby").getValueAsString();
		timestamp = System.currentTimeMillis();
		this.running = true;

	}

	public GeoEvent process(GeoEvent evt) throws Exception {

			GeoEventDefinition ged = evt.getGeoEventDefinition();
			FieldDefinition fd = ged.getFieldDefinition(sortfield);
			if(fd == null)
				return null;
			Object val = null;
			FieldType type = fd.getType();
			if(type == FieldType.Date)
			{
				Date d = (Date)evt.getField(sortfield);
				val = (Long)d.getTime();
			}
			else
			{
				val = evt.getField(sortfield);
			}
			if (sorted.containsKey(val)) {
				ArrayList<GeoEvent> evtList = sorted.get(val);
				evtList.add(evt);
				sorted.put(val, evtList);
			} else {
				ArrayList<GeoEvent> evtList = new ArrayList<GeoEvent>();
				evtList.add(evt);
				sorted.put(val, evtList);
			}

		return null;
	}

	@Override
	public synchronized void validate() throws ValidationException {
		// Validation Phase ...
		super.validate();

	}
	
	@Override
	public void onServiceStart()
	{
		startMonitoring();
	}
	
	@Override
	public void onServiceStop()
	{
		stopMonitoring();
	}

	@Override
	public void shutdown() {
		sorted.clear();
		super.shutdown();
	}

	@Override
	public boolean isGeoEventMutator() {
		return true;
	}

	@Override
	public EventDestination getEventDestination() {
		return (geoEventProducer != null) ? geoEventProducer
				.getEventDestination() : null;
	}

	@Override
	public List<EventDestination> getEventDestinations() {
		return (geoEventProducer != null) ? Arrays.asList(geoEventProducer
				.getEventDestination()) : new ArrayList<EventDestination>();
	}

	@Override
	public void disconnect() {
		if (geoEventProducer != null)
			geoEventProducer.disconnect();
	}

	@Override
	public boolean isConnected() {
		return (geoEventProducer != null) ? geoEventProducer.isConnected()
				: false;
	}

	@Override
	public String getStatusDetails() {
		return (geoEventProducer != null) ? geoEventProducer.getStatusDetails()
				: "";
	}

	@Override
	public void setup() throws MessagingException {
		;
	}

	@Override
	public void init() throws MessagingException {
		;
	}

	@Override
	public void update(Observable o, Object arg) {
		;
	}

	public void setManager(GeoEventDefinitionManager manager) {
		this.manager = manager;
	}

	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
		this.geoEventCreator = messaging.createGeoEventCreator();
	}

	private void startMonitoring() {
		try {
			this.monitoring=true;
			t = new Thread(this);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void stopMonitoring()
	{
		this.monitoring=false;
		sorted.clear();
		t.interrupt();

	}

	@Override
	public void run() {
		while (this.monitoring) {
			try {
				Thread.sleep(interval);
				if (running) {
					long now = System.currentTimeMillis();
					long testInterval = now - this.timestamp;
					if (testInterval>=this.interval) {
						timestamp = now;
						flush();
					}
				}
			} catch (Exception e) {

			}
		}

	}
	
	private void flush() throws MessagingException
	{
		Set<Object> keys = sorted.keySet();
		Iterator<Object> it = keys.iterator();
		while (it.hasNext()) {
			Object k = it.next();
			List<GeoEvent> list = sorted.remove(k);
			for (GeoEvent msg : list) {
				send(msg);
			}
		}
	}

}
	



