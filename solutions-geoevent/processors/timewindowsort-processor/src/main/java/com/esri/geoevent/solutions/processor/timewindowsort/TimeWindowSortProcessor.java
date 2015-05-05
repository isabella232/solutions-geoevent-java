package com.esri.geoevent.solutions.processor.timewindowsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import com.esri.ges.core.component.ComponentException;
import com.esri.ges.core.geoevent.FieldDefinition;
import com.esri.ges.core.geoevent.FieldType;
import com.esri.ges.core.geoevent.GeoEvent;
import com.esri.ges.core.geoevent.GeoEventDefinition;
import com.esri.ges.core.validation.ValidationException;
import com.esri.ges.manager.geoeventdefinition.GeoEventDefinitionManager;
import com.esri.ges.messaging.EventDestination;
import com.esri.ges.messaging.EventUpdatable;
import com.esri.ges.messaging.GeoEventCreator;
import com.esri.ges.messaging.GeoEventProducer;
import com.esri.ges.messaging.Messaging;
import com.esri.ges.messaging.MessagingException;
import com.esri.ges.processor.GeoEventProcessorBase;
import com.esri.ges.processor.GeoEventProcessorDefinition;

public class TimeWindowSortProcessor extends GeoEventProcessorBase implements
GeoEventProducer, EventUpdatable, Runnable{
	private Integer interval;
	private String sortfield;
	private Boolean clearCache = false;
	private SortedMap<Object, ArrayList<GeoEvent>>sorted=new TreeMap<Object, ArrayList<GeoEvent>>();
	private GeoEventCreator geoEventCreator;
	private GeoEventDefinitionManager manager;
	private Messaging messaging;
	private GeoEventProducer geoEventProducer;
	private long timestamp;
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
	public void afterPropertiesSet()
	{
		interval = (Integer)properties.get("interval").getValue();
		sortfield = properties.get("orderby").getValueAsString();
		timestamp = System.currentTimeMillis();
		
	}

	public GeoEvent process(GeoEvent evt) throws Exception {
		if(clearCache)
		{
			clearCache = false;
			Set<Object> keys = sorted.keySet();
			Iterator<Object>it = keys.iterator();
			while(it.hasNext())
			{
				Object k = it.next();
				List<GeoEvent> list = sorted.remove(k);
				for(GeoEvent msg: list)
				{
					send(msg);
				}
			}
		}
		else
		{
			Object fldVal = evt.getField(sortfield);
			if(sorted.containsKey(fldVal))
			{
				ArrayList<GeoEvent> evtList = sorted.get(fldVal);
				evtList.add(evt);
				sorted.put(fldVal, evtList);
			}
			else
			{
				ArrayList<GeoEvent> evtList = new ArrayList<GeoEvent>();
				evtList.add(evt);
				sorted.put(fldVal,  evtList);
			}
		}
		return null;
	}
	@Override
	public synchronized void validate() throws ValidationException {
		// Validation Phase ...
		super.validate();
		
	}
	
	@Override
	public void shutdown() {
		// Destruction Phase
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
	
	private SortedMap GenerateCache(GeoEvent evt)
	{
		SortedMap<Object, GeoEvent> sorted = null;
		GeoEventDefinition ged = evt.getGeoEventDefinition();
		List<FieldDefinition>fldDefs = ged.getFieldDefinitions();
		for(FieldDefinition fd: fldDefs)
		{
			if(fd.getName().equals(sortfield))
			{
				//createCache=false;
				return new TreeMap<Object, GeoEvent>();
			}
		}
		return null;
		
	}
	public void setManager(GeoEventDefinitionManager manager)
	{
		this.manager = manager;
	}
	
	public void setMessaging(Messaging messaging)
	{
		this.messaging = messaging;
		this.geoEventCreator = messaging.createGeoEventCreator();
	}
	@Override
	public void run() {
		long now = System.currentTimeMillis();
		
	}
	

}
