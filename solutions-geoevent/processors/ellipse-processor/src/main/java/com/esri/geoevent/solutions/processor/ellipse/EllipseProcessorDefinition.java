package com.esri.geoevent.solutions.processor.ellipse;

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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.esri.ges.core.geoevent.GeoEventDefinition;
import com.esri.ges.core.property.LabeledValue;
import com.esri.ges.core.property.PropertyDefinition;
import com.esri.ges.core.property.PropertyException;
import com.esri.ges.core.property.PropertyType;
import com.esri.ges.manager.geoeventdefinition.GeoEventDefinitionManager;
import com.esri.ges.processor.GeoEventProcessorDefinitionBase;

public class EllipseProcessorDefinition extends GeoEventProcessorDefinitionBase {
	GeoEventDefinitionManager manager;
	private static final Log LOG = LogFactory
			.getLog(EllipseProcessorDefinition.class);
	public EllipseProcessorDefinition() throws PropertyException {
		
	}

	public void setManager(GeoEventDefinitionManager m) {
		try {
			this.manager = m;
			List<LabeledValue> allowedSources = new ArrayList<LabeledValue>();
			allowedSources.add(new LabeledValue("${com.esri.geoevent.solutions.processor.ellipse.ellipse-processor.SRC_CONSTANT_LBL}","Constant"));
			allowedSources.add(new LabeledValue("${com.esri.geoevent.solutions.processor.ellipse.ellipse-processor.SRC_EVENT_LBL}","Event"));
			PropertyDefinition procMajAxisSource = new PropertyDefinition(
					"majorAxisSource", PropertyType.String, "",
					"Major Axis Source", "Source of Major Axis Value", true,
					false, allowedSources);

			propertyDefinitions.put(procMajAxisSource.getPropertyName(),
					procMajAxisSource);

			PropertyDefinition procMajorAxisRadius = new PropertyDefinition(
					"majorAxisRadius", PropertyType.Double, 10000.0,
					"Major Axis Radius", "Length of ellipse's major axis",
					true, false);
			procMajorAxisRadius.setDependsOn("majorAxisSource=Constant");
			propertyDefinitions.put(procMajorAxisRadius.getPropertyName(),
					procMajorAxisRadius);

			PropertyDefinition procMajAxisEvent = new PropertyDefinition(
					"majorAxisEvent", PropertyType.String, "majorAxis",
					"Major Axis Event Field",
					"Geoevent field containing major axis data", true, false);
			procMajAxisEvent.setDependsOn("majorAxisSource=Event");
			
			propertyDefinitions.put(procMajAxisEvent.getPropertyName(),
					procMajAxisEvent);

			PropertyDefinition procMinAxisSource = new PropertyDefinition(
					"minorAxisSource", PropertyType.String, "",
					"Minor Axis Source", "Source of Minor Axis Value", true,
					false, allowedSources);

			propertyDefinitions.put(procMinAxisSource.getPropertyName(),
					procMinAxisSource);

			PropertyDefinition procMinorAxisRadius = new PropertyDefinition(
					"minorAxisRadius", PropertyType.Double, 5000.0,
					"Minor Axis Radius",
					"Length of ellipse's minor axis radius", true, false);
			procMinorAxisRadius.setDependsOn("minorAxisSource=Constant");
			propertyDefinitions.put(procMinorAxisRadius.getPropertyName(),
					procMinorAxisRadius);

			PropertyDefinition procMinAxisEvent = new PropertyDefinition(
					"minorAxisEvent", PropertyType.String, "minorAxis",
					"Minor Axis Event Field",
					"Geoevent field containing minor axis data", true, false);
			procMinAxisEvent.setDependsOn("minorAxisSource=Event");
			propertyDefinitions.put(procMinAxisEvent.getPropertyName(),
					procMinAxisEvent);

			List<LabeledValue> unitsAllowedVals = new ArrayList<LabeledValue>();
			unitsAllowedVals.add(new LabeledValue("${com.esri.geoevent.solutions.processor.ellipse.ellipse-processor.UNITS_METERS_LBL}","Meters"));
			unitsAllowedVals.add(new LabeledValue("${com.esri.geoevent.solutions.processor.ellipse.ellipse-processor.UNITS_KM_LBL}","Kilometers"));
			unitsAllowedVals.add(new LabeledValue("${com.esri.geoevent.solutions.processor.ellipse.ellipse-processor.UNITS_FT_LBL}","Feet"));
			unitsAllowedVals.add(new LabeledValue("${com.esri.geoevent.solutions.processor.ellipse.ellipse-processor.UNITS_MILES_LBL}","Miles"));
			unitsAllowedVals.add(new LabeledValue("${com.esri.geoevent.solutions.processor.ellipse.ellipse-processor.UNITS_NM_LBL}","Nautical Miles"));
			PropertyDefinition procUnits = new PropertyDefinition("units",
					PropertyType.String, "${com.esri.geoevent.solutions.processor.ellipse.ellipse-processor.UNITS_METERS_LBL}", "Units", "Units of measurement",
					true, false, unitsAllowedVals);
			
			propertyDefinitions.put(procUnits.getPropertyName(), procUnits);

			PropertyDefinition procRotationSource = new PropertyDefinition(
					"rotationSource", PropertyType.String, "",
					"Rotation Source", "Source of Rotation Value", true, false, allowedSources);
			

			propertyDefinitions.put(procRotationSource.getPropertyName(),
					procRotationSource);

			PropertyDefinition procRotationAngle = new PropertyDefinition(
					"rotation", PropertyType.Double, 0.0, "rotation",
					"Angle of rotation (geographic)", true, false);
			procRotationAngle.setDependsOn("rotationSource=Constant");
			propertyDefinitions.put(procRotationAngle.getPropertyName(),
					procRotationAngle);

			PropertyDefinition procRotationEvent = new PropertyDefinition(
					"rotationEvent", PropertyType.String, "rotation",
					"Rotation Event Field",
					"Geoevent field containing rotation data", true, false);
			procRotationEvent.setDependsOn("rotationSource=Event");

			propertyDefinitions.put(procRotationEvent.getPropertyName(),
					procRotationEvent);

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
			LOG.error("Geometry processor");
			LOG.error(e.getMessage());
			LOG.error(e.getStackTrace());
		} catch (Exception e) {
			LOG.error("Geometry processor");
			LOG.error(e.getMessage());
			LOG.error(e.getStackTrace());
		}
	}
	
	
	@Override
	public String getName() {
		return "EllipseProcessor";
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
		return "Ellipse Processor";
	}

	@Override
	public String getDescription() {
		return "Returns ellipse derived from event center, major axis radial length, minor axis radial length, and rotation angle";
	}

	@Override
	public String getContactInfo() {
		return "geoeventprocessor@esri.com";
  }
}

