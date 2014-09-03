package com.esri.geoevent.solutions.processor.rangefan;

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
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.esri.ges.core.property.LabeledValue;
import com.esri.ges.core.property.PropertyDefinition;
import com.esri.ges.core.property.PropertyException;
import com.esri.ges.core.property.PropertyType;
import com.esri.ges.processor.GeoEventProcessorDefinitionBase;

public class RangeFanProcessorDefinition extends
		GeoEventProcessorDefinitionBase {

	private static final Log LOG = LogFactory
			.getLog(RangeFanProcessorDefinition.class);

	public RangeFanProcessorDefinition() throws PropertyException {
		try {

			List<LabeledValue> allowedGeoSources = new ArrayList<LabeledValue>();
			allowedGeoSources.add(new
			LabeledValue("${com.esri.geoevent.solutions.processor.rf.rangefan-processor.SRC_GEOEVENT}","event"));
			allowedGeoSources.add(new
			LabeledValue("${com.esri.geoevent.solutions.processor.rf.rangefan-processor.SRC_EVENT_DEF}","geodef"));
			allowedGeoSources.add(new
			LabeledValue("${com.esri.geoevent.solutions.processor.rf.rangefan-processor.SRC_COORD_FIELDS}","coord"));
			//allowedGeoSources.add(new LabeledValue("GeoEvent", "event"));
			//allowedGeoSources
					//.add(new LabeledValue("Event Definition", "geodef"));
			//allowedGeoSources
					//.add(new LabeledValue("Coordinate Fields", "coord"));
			// PropertyDefinition procGeometrySource = new PropertyDefinition(
			// "geosrc", PropertyType.String,
			// "${com.esri.geoevent.solutions.processor.rangefan.rangefan-processor.SRC_GEOEVENT_LBL}",
			// "Source of query geometry", "Source of query geometry",
			// true, false, allowedGeoSources);
			PropertyDefinition procGeometrySource = new PropertyDefinition(
					"geosrc", PropertyType.String, "${com.esri.geoevent.solutions.processor.rf.rangefan-processor.SRC_GEOEVENT}",
					"Source of query geometry", "Source of query geometry",
					true, false, allowedGeoSources);
			propertyDefinitions.put(procGeometrySource.getPropertyName(),
					procGeometrySource);

			PropertyDefinition procGeometryEventFld = new PropertyDefinition(
					"geoeventfld", PropertyType.String, "Geometry",
					"Geometry Event Field",
					"Geoevent field containing buffer geometry data", false,
					false);
			procGeometryEventFld.setDependsOn("geosrc=geodef");
			propertyDefinitions.put(procGeometryEventFld.getPropertyName(),
					procGeometryEventFld);

			PropertyDefinition procXField = new PropertyDefinition("xfield",
					PropertyType.String, "longitude", "X-Coord Field",
					"field holding x-coordinate", false, false);
			procXField.setDependsOn("geosrc=coord");
			propertyDefinitions.put(procXField.getPropertyName(), procXField);

			PropertyDefinition procYField = new PropertyDefinition("yfield",
					PropertyType.String, "latitude", "Y-Coord Field",
					"field holding y-coordinate", false, false);
			procYField.setDependsOn("geosrc=coord");
			propertyDefinitions.put(procYField.getPropertyName(), procYField);

			List<LabeledValue> allowedSources = new ArrayList<LabeledValue>();
			allowedSources.add(new
			LabeledValue("${com.esri.geoevent.solutions.processor.rf.rangefan-processor.SRC_CONSTANT}","Constant"));
			allowedSources.add(new
			LabeledValue("${com.esri.geoevent.solutions.processor.rf.rangefan-processor.SRC_EVENT}","Event"));
			//allowedSources.add(new LabeledValue("Constant", "Constant"));
			//allowedSources.add(new LabeledValue("Event", "Event"));
			//PropertyDefinition procRangeSource = new PropertyDefinition(
					//"rangeSource",
					//PropertyType.String,
					//"${com.esri.geoevent.solutions.processor.rangefan.rangefan-processor.SRC_CONSTANT_LBL}",
					//"Range Source", "Source of range Value", true, false,
					//allowedSources);
					
			PropertyDefinition procRangeSource = new PropertyDefinition(
							"rangeSource",
							PropertyType.String,
							"${com.esri.geoevent.solutions.processor.rf.rangefan-processor.SRC_CONSTANT}",
							"Range Source", "Source of range Value", true, false,
							allowedSources);		
			propertyDefinitions.put(procRangeSource.getPropertyName(),
					procRangeSource);

			PropertyDefinition procRange = new PropertyDefinition("range",
					PropertyType.Double, 1000, "Range",
					"Maximum distance from event for analysis", true, false);
			procRange.setDependsOn("rangeSource=Constant");
			propertyDefinitions.put(procRange.getPropertyName(), procRange);

			PropertyDefinition procRangeEvent = new PropertyDefinition(
					"rangeEvent", PropertyType.String, "range",
					"Range Event Field",
					"Geoevent field containing range data", true, false);
			procRangeEvent.setDependsOn("rangeSource=Event");
			propertyDefinitions.put(procRangeEvent.getPropertyName(),
					procRangeEvent);

			List<LabeledValue> unitsAllowedVals = new ArrayList<LabeledValue>();
			unitsAllowedVals.add(new
			LabeledValue("${com.esri.geoevent.solutions.processor.rf.rangefan-processor.UNITS_METERS}","Meters"));
			unitsAllowedVals.add(new
			LabeledValue("${com.esri.geoevent.solutions.processor.rf.rangefan-processor.UNITS_KM}","Kilometers"));
			unitsAllowedVals.add(new
			LabeledValue("${com.esri.geoevent.solutions.processor.rf.rangefan-processor.UNITS_FT}","Feet"));
			unitsAllowedVals.add(new
			LabeledValue("${com.esri.geoevent.solutions.processor.rf.rangefan-processor.UNITS_MILES}","Miles"));
			unitsAllowedVals.add(new
			LabeledValue("${com.esri.geoevent.solutions.processor.rf.rangefan-processor.UNITS_NM}","Nautical Miles"));
			//unitsAllowedVals.add(new LabeledValue("Meters", "Meters"));
			//unitsAllowedVals.add(new LabeledValue("Kilometers", "Kilometers"));
			//unitsAllowedVals.add(new LabeledValue("Feet", "Feet"));
			//unitsAllowedVals.add(new LabeledValue("Miles", "Miles"));
			//unitsAllowedVals.add(new LabeledValue("Nautical Miles",
					//"Nautical Miles"));
			PropertyDefinition procUnits = new PropertyDefinition("units",
					PropertyType.String, "${com.esri.geoevent.solutions.processor.rf.rangefan-processor.UNITS_METERS}", "Range Units",
					"Units of measurement", true, false, unitsAllowedVals);

			propertyDefinitions.put(procUnits.getPropertyName(), procUnits);

			PropertyDefinition procBearingSource = new PropertyDefinition(
					"bearingSource",
					PropertyType.String,
					"${com.esri.geoevent.solutions.processor.rf.rangefan-processor.SRC_CONSTANT}",
					"Bearing Source", "Source of Bearing Value", true, false,
					allowedSources);
			propertyDefinitions.put(procBearingSource.getPropertyName(),
					procBearingSource);

			PropertyDefinition procBearingC = new PropertyDefinition("bearing",
					PropertyType.Double, 0, "Bearing", "Bearing Angle", true,
					false);
			procBearingC.setDependsOn("bearingSource=Constant");
			propertyDefinitions.put(procBearingC.getPropertyName(),
					procBearingC);

			PropertyDefinition procBearingEvent = new PropertyDefinition(
					"bearingEvent", PropertyType.String, "bearing",
					"Bearing Event Field",
					"Geoevent field containing bearing data", true, false);
			procBearingEvent.setDependsOn("bearingSource=Event");
			propertyDefinitions.put(procBearingEvent.getPropertyName(),
					procBearingEvent);

			PropertyDefinition procTraversalSource = new PropertyDefinition(
					"traversalSource",
					PropertyType.String,
					"${com.esri.geoevent.solutions.processor.rf.rangefan-processor.SRC_CONSTANT}",
					"Traversal Source", "Source of Traversal Value", true,
					false, allowedSources);
			propertyDefinitions.put(procTraversalSource.getPropertyName(),
					procTraversalSource);

			PropertyDefinition procTraversal = new PropertyDefinition(
					"traversal", PropertyType.Double, 30, "Traversal",
					"Traversal Angle - (>0 and <360 degrees)", true, false);
			procTraversal.setDependsOn("traversalSource=Constant");
			propertyDefinitions.put(procTraversal.getPropertyName(),
					procTraversal);

			PropertyDefinition procTraversalEvent = new PropertyDefinition(
					"traversalEvent", PropertyType.String, "traversal",
					"Traversal Event Field",
					"Geoevent field containing traversal angle data", true,
					false);
			procTraversalEvent.setDependsOn("traversalSource=Event");
			propertyDefinitions.put(procTraversalEvent.getPropertyName(),
					procTraversalEvent);

			PropertyDefinition procWKIDIn = new PropertyDefinition("wkidin",
					PropertyType.Integer, 4326, "Input WKID",
					"Coordinate system of input feature", true, false);
			propertyDefinitions.put(procWKIDIn.getPropertyName(), procWKIDIn);

			PropertyDefinition procWKIDBuffer = new PropertyDefinition(
					"wkidbuffer", PropertyType.Integer, 3857, "Processor WKID",
					"Coordinate system to calculate the buffer", true, false);
			propertyDefinitions.put(procWKIDBuffer.getPropertyName(),
					procWKIDBuffer);

			PropertyDefinition procWKIDOut = new PropertyDefinition("wkidout",
					PropertyType.Integer, 4326, "Output WKID",
					"Output Coordinate system", true, false);
			propertyDefinitions.put(procWKIDOut.getPropertyName(), procWKIDOut);
		} catch (PropertyException e) {
			LOG.error(e.getMessage());
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}

	}

	@Override
	public String getName() {
		return "RangeFanProcessor";
	}

	@Override
	public String getDomain() {
		return "com.esri.geoevent.solutions.processor.geometry";
	}

	@Override
	public String getVersion() {
		return "10.3.0";
	}

	@Override
	public String getLabel() {
		return "Range Fan Processor";
	}

	@Override
	public String getDescription() {
		return "Returns range fan derived from event center, range, bearing, and traversal angle";
	}

	@Override
	public String getContactInfo() {
		return "geoeventprocessor@esri.com";
	}
}
