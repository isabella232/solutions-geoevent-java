

package com.esri.geoevent.solutions.processor.incrementalPoint;

/*
 * #%L
 * Esri :: AGES :: Solutions :: Processor :: Geometry
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2013 - 2014 Esri
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Observable;

import com.esri.core.geometry.Envelope;
import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.GeometryEngine;
import com.esri.core.geometry.LinearUnit;
import com.esri.core.geometry.MapGeometry;
import com.esri.core.geometry.Point;
import com.esri.core.geometry.Polyline;
import com.esri.core.geometry.SpatialReference;
import com.esri.core.geometry.Unit;
import com.esri.ges.core.ConfigurationException;
import com.esri.ges.core.component.ComponentException;
import com.esri.ges.core.geoevent.DefaultFieldDefinition;
import com.esri.ges.core.geoevent.DefaultGeoEventDefinition;
import com.esri.ges.core.geoevent.FieldDefinition;
import com.esri.ges.core.geoevent.FieldException;
import com.esri.ges.core.geoevent.FieldType;
import com.esri.ges.core.geoevent.GeoEvent;
import com.esri.ges.core.geoevent.GeoEventDefinition;
import com.esri.ges.core.validation.ValidationException;
import com.esri.ges.framework.i18n.BundleLogger;
import com.esri.ges.framework.i18n.BundleLoggerFactory;
import com.esri.ges.manager.geoeventdefinition.GeoEventDefinitionManager;
import com.esri.ges.manager.geoeventdefinition.GeoEventDefinitionManagerException;
import com.esri.ges.messaging.EventDestination;
import com.esri.ges.messaging.EventUpdatable;
import com.esri.ges.messaging.GeoEventCreator;
import com.esri.ges.messaging.GeoEventProducer;
import com.esri.ges.messaging.Messaging;
import com.esri.ges.messaging.MessagingException;
import com.esri.ges.processor.GeoEventProcessorBase;
import com.esri.ges.processor.GeoEventProcessorDefinition;


public class IncrementalPointProcessor extends GeoEventProcessorBase implements
GeoEventProducer, EventUpdatable {
	class IncrementPoint
	{
		private Point point;
		Integer nextVertexIndex;
		IncrementPoint(Point p, Integer i)
		{
			this.point = p;
			this.nextVertexIndex=i;
		}
		
		public Point getPoint()
		{
			return this.point;
		}
		
		public Integer getNextVertexIndex()
		{
			return this.nextVertexIndex;
		}
	}
	private String pointType;
	private int processWkid;
	private String outDef;
	private List<FieldDefinition> fds;
	private Boolean createDef = false;
	private GeoEventDefinition ged;
	private GeoEventCreator geoEventCreator;
	private GeoEventDefinitionManager manager;
	private Messaging messaging;
	private GeoEventProducer geoEventProducer;
	private SpatialReference outSr;
	private String intervalType;
	private Double distInterval;
	private long timeInterval;
	private Boolean usingTime;
	private static final BundleLogger LOGGER = BundleLoggerFactory
			.getLogger(IncrementalPointProcessor.class);
	public IncrementalPointProcessor(GeoEventProcessorDefinition definition) throws ComponentException {
		super(definition);
		//spatial = s;
		geoEventMutator = true;
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
		intervalType = properties.get("intervalType").getValueAsString();
		if(intervalType.equals("time"))
		{
			timeInterval = (long)properties.get("timeinterval").getValue();
			usingTime = true;
		}
		else if(intervalType.equals("distance"))
		{
			distInterval = (Double)properties.get("distanceinterval").getValue();
			usingTime = false;
		}
		processWkid = (Integer)properties.get("wkid").getValue();
		outDef = properties.get("outdefname").getValueAsString();
		fds = new ArrayList<FieldDefinition>();
		try {
			fds.add(new DefaultFieldDefinition("LocationTimeStamp", FieldType.Date, "TIMESTAMP"));
			if ((ged = manager.searchGeoEventDefinition(outDef, definition.getUri().toString())) == null)
			{
				createDef = true;
			}
		}
		catch(ConfigurationException e)
		{
			LOGGER.error(e.getMessage());
		}
		
	}

	@Override
	public synchronized void validate() throws ValidationException {
		// Validation Phase ...
		super.validate();
		
	}

	@Override
	public GeoEvent process(GeoEvent ge) throws Exception {
		
		
		
		if (createDef) {
			createGeoEventDefinition(ge);
			createDef=false;
		}
		Date timeStart = (Date)ge.getField("TIME_START");
		Date timeEnd = (Date)ge.getField("TIME_END");
		if(timeStart== null)
			return null;
		if(timeEnd==null)
			return null;
		
		MapGeometry mapGeo = ge.getGeometry();
		Geometry geo = mapGeo.getGeometry();
		if(geo.getType()!=Geometry.Type.Polyline)
			return null;
		Polyline polyln = (Polyline)geo;
		
		Point startPt = polyln.getPoint(0);
		Date startTime = ge.getStartTime();
		//Date endTime = ge.getEndTime();
		Geometry outGeo = null;
		Date ts = null;
		Unit unit = LinearUnit.create(9001);
		LinearUnit lu = (LinearUnit) unit;
		double distTotal = GeometryEngine.geodesicLength(polyln, outSr, lu);
		int numHops = 0;
		if(usingTime)
		{
			distInterval = distTotal/((timeStart.getTime() - timeEnd.getTime())/timeInterval);
			numHops = (int) Math.floor(distTotal/distInterval);
		}
		else
		{
			numHops = (int) Math.floor(distTotal/distInterval);
			timeInterval = (timeStart.getTime() - timeEnd.getTime())/numHops;
		}
		
		Integer ptIndex = 0;
		GeoEvent msg = null;
		for(int i = 0; i < numHops; ++i)
		{
			IncrementPoint ip = this.getNextPoint(polyln, startPt, ptIndex, distInterval);
			outGeo = ip.getPoint();
			MapGeometry outMapGeo = new MapGeometry(outGeo, mapGeo.getSpatialReference());
			long incrementTime = startTime.getTime() + (timeInterval * i);
			ts = new Date(incrementTime);
			msg = createIncrementalPointGeoevent(ge, outMapGeo, ts);
			send(msg);
			startPt = (Point)outGeo;
			ptIndex = ip.getNextVertexIndex();
		}
		
		return msg;
	}
	
	private GeoEvent createIncrementalPointGeoevent(GeoEvent event, MapGeometry outGeo, Date ts) throws MessagingException, FieldException
	{
		GeoEventCreator creator = messaging.createGeoEventCreator();
		GeoEvent msg = creator.create(outDef, definition.getUri().toString());
		for(FieldDefinition fd: event.getGeoEventDefinition().getFieldDefinitions())
		{
			if(fd.getTags().contains("GEOMETRY"))
			{
				msg.setGeometry(outGeo);
			}
			else
			{
				msg.setField(fd.getName(), event.getField(fd.getName()));
			}
			msg.setField("TIMESTAMP", ts);
	
		}
		return msg;
	}
	
	private void createGeoEventDefinition(GeoEvent event)
	{
		
		GeoEventDefinition eventDef = event.getGeoEventDefinition();
		try {
			ged = eventDef.augment(fds);
		} catch (ConfigurationException e) {
			LOGGER.error(e.getLocalizedMessage());
		}
		ged.setName(outDef);
		ged.setOwner(definition.getUri().toString());
		try {
			manager.addGeoEventDefinition(ged);
		} catch (GeoEventDefinitionManagerException e) {
			LOGGER.error(e.getMessage());
		}
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
	
	public void onServiceStart() {
		// Service Start Phase
	}
	
	public void onServiceStop() {
		// Service Stop Phase
	}
	
	private IncrementPoint getNextPoint(Polyline polyln, Point startPt, Integer i, Double dist)
	{
		Point startVertex = polyln.getPoint(i);
		Double currentDist = GeometryEngine.distance(startPt, startVertex, outSr);
		Point segStart = null;
		Point segEnd = null;
		Boolean multipleVertices = true;
		if(currentDist > dist)
		{
			segStart = startPt;
			segEnd = startVertex;
			multipleVertices = false;
		}
		while(currentDist > dist)
		{
			Point start = polyln.getPoint(i);
			Point end = polyln.getPoint(i+1);
			currentDist += GeometryEngine.distance(start, end, outSr);
			++i;
		}
		if(multipleVertices)
		{
			segStart = polyln.getPoint(i-1);
			segEnd = polyln.getPoint(i);
		}
		Double segLen = GeometryEngine.distance(segStart, segEnd, outSr);
		Double distOver = currentDist - dist;
		Double distOnSeg = segLen - distOver;
		Point p = findPtOnSegment(segStart, segEnd, distOnSeg);
		IncrementPoint ip = new IncrementPoint(p, i);
		return ip;
	}
	
	private Point findPtOnSegment(Point segStart, Point segEnd, Double d)
	{
		Point pt = null;
		Double x1, y1, x2, y2;
		x1 = segStart.getX();
		y1 = segStart.getY();
		x2 = segEnd.getX();
		y2 = segEnd.getY();
		
		Double diffXsquare = Math.pow((x2-x1), 2);
		Double diffYsquare = Math.pow((y2-y1), 2);
		Double x = x1 + d*(x2-x1)/Math.sqrt(diffXsquare+diffYsquare);
		Double y = y1 + d*(y2-y1)/Math.sqrt(diffXsquare + diffYsquare);
		
		pt = new Point(x,y);
		return pt;
	}
	
	public void setManager(GeoEventDefinitionManager manager)
	{
		this.manager = manager;
	}
	
	public void setMessaging(Messaging messaging)
	{
		this.messaging = messaging;
	}
	
}


