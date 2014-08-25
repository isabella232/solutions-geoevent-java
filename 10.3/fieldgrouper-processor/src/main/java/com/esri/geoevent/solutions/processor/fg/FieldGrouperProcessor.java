package com.esri.geoevent.solutions.processor.fg;

/*
 * #%L
 * FieldGrouperProcessor.java - fieldgrouper - Esri - 2013
 * org.codehaus.mojo-license-maven-plugin-1.5
 * $Id: update-file-header-config.apt.vm 17764 2012-12-12 10:22:04Z tchemit $
 * $HeadURL: https://svn.codehaus.org/mojo/tags/license-maven-plugin-1.5/src/site/apt/examples/update-file-header-config.apt.vm $
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.esri.ges.core.ConfigurationException;
import com.esri.ges.core.component.ComponentException;
import com.esri.ges.core.geoevent.DefaultFieldDefinition;
import com.esri.ges.core.geoevent.DefaultGeoEventDefinition;
import com.esri.ges.core.geoevent.FieldCardinality;
import com.esri.ges.core.geoevent.FieldDefinition;
import com.esri.ges.core.geoevent.FieldGroup;
import com.esri.ges.core.geoevent.FieldType;
import com.esri.ges.core.geoevent.GeoEvent;
import com.esri.ges.core.geoevent.GeoEventDefinition;
import com.esri.ges.core.property.PropertyException;
import com.esri.ges.manager.geoeventdefinition.GeoEventDefinitionManager;
import com.esri.ges.messaging.GeoEventCreator;
import com.esri.ges.messaging.Messaging;
import com.esri.ges.processor.GeoEventProcessorBase;
import com.esri.ges.processor.GeoEventProcessorDefinition;

public class FieldGrouperProcessor extends GeoEventProcessorBase {
	Messaging messaging;
	GeoEventDefinitionManager manager;
	Map<String, TrackRecord> recordCache = new HashMap<String, TrackRecord>();
	private static final Log LOG = LogFactory.getLog(FieldGrouperProcessor.class);
	private Integer numIn;
	private String gfname;
	private final Double THRESHOLD_MILLISEC = 100000.0;
	class TrackRecord {
		double lastTime = System.currentTimeMillis();
		ArrayList<GeoEvent> events = new ArrayList<GeoEvent>();
	}
	public FieldGrouperProcessor(GeoEventProcessorDefinition definition, GeoEventDefinitionManager gedm, Messaging m)
			throws ComponentException{
		super(definition);
		//((FieldGrouperProcessorDefinition)definition).refreshDefinition();
		messaging = m;
		manager = gedm;
		
	}
	@Override
	public void shutdown()
	{
			recordCache.clear();
			recordCache = null;
			super.shutdown();
	}
	public GeoEvent process(GeoEvent evt) throws Exception {
		try {
			String trackid = evt.getTrackId();
			numIn = (Integer) properties.get("num-inputs").getValue();
			String eventfld = properties.get("group-field").getValue()
					.toString();
			String[] arr = eventfld.split(":");
			gfname = arr[1];
			if (recordCache.containsKey(trackid)) {
				TrackRecord curRec = recordCache.get(trackid);
				double now = System.currentTimeMillis();
				double elapsed_time = now - curRec.lastTime;
				curRec.lastTime = now;
				curRec.events.add(evt);
				if (curRec.events.size() >= numIn
						|| elapsed_time > THRESHOLD_MILLISEC) {
					recordCache.remove(trackid);
					return mergeEvents(curRec);
				}
			} else {
				TrackRecord curRec = new TrackRecord();
				curRec.events.add(evt);
				recordCache.put(trackid, curRec);
			}
			return null;
		} catch (Exception e) {
			LOG.error(e.getMessage());
			LOG.error(e.getStackTrace());
			throw (e);
		}
	}
	
	@SuppressWarnings("unchecked")
	private GeoEvent mergeEvents(TrackRecord tr) throws Exception {
		try {
			GeoEvent evt = tr.events.get(0);
			GeoEventDefinition geDef = evt.getGeoEventDefinition();

			String outDefName = geDef.getName() + "_out";
			GeoEventDefinition outDef = null;
			StringBuffer sb = new StringBuffer();
			Boolean first = true;
			for (GeoEvent ge : tr.events) {
				String o = "";
				if(first)
				{
					o += "\n";
					first = false;
				}
				o += (String)ge.getField(gfname) + "\n";
				sb.append(o);
			}
			if((outDef = manager.getGeoEventDefinition(outDefName))==null)
			{
				outDef = new DefaultGeoEventDefinition();
				outDef.setOwner(geDef.getOwner());
				outDef.setName(geDef.getName() + "_out");
				List<FieldDefinition> newFieldDefs = new ArrayList<FieldDefinition>();
				for(FieldDefinition fd: geDef.getFieldDefinitions())
				{
					if(fd.getName().equals(gfname))
					{
						FieldDefinition newFd = new DefaultFieldDefinition(fd.getName(), FieldType.Group);
						for (int i = 0; i < tr.events.size(); ++i)
						{
							String name = gfname + new Integer(i+1).toString();
							FieldDefinition childFd = new DefaultFieldDefinition(name, fd.getType());
							newFd.addChild(childFd);
						}
						newFieldDefs.add(newFd);
					}
					else
					{
						newFieldDefs.add(fd);
					}
				}
				outDef.setFieldDefinitions(newFieldDefs);
				manager.addGeoEventDefinition(outDef);
			}
			
			GeoEventCreator creator = messaging.createGeoEventCreator();
			GeoEvent newEvent = creator.create(outDef.getGuid());
			for(FieldDefinition fd: geDef.getFieldDefinitions())
			{
				String n = fd.getName();
				if(n.equals(gfname))
				{
					FieldGroup fg = newEvent.createFieldGroup(gfname);
					Integer index = 0;
					for (GeoEvent ge : tr.events) {
						fg.setField(index, ge.getField(gfname));
						++index;
					}
					/*if(newEvent.getField(gfname)==null)
					{
						newEvent.setField(gfname, new ArrayList<FieldGroup>());
					}
					((List<FieldGroup>)newEvent.getField(gfname)).add(fg);*/
					newEvent.setField(gfname, fg);
				}
				else
				{
					newEvent.setField(n, evt.getField(n));
					
				}
			}
			
			//newEvent.setField(gfname, groupVals);
			return newEvent;
		} catch (ConfigurationException e) {
			LOG.error("Error configuring field definition");
			LOG.error(e.getStackTrace());
			throw(e);
		}
		catch(Exception e)
		{
			LOG.error(e.getMessage());
			LOG.error(e.getStackTrace());
			throw(e);
		}
	}
}
