package com.esri.geoevent.solutions.processor.buffer;

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
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.esri.ges.core.geoevent.FieldDefinition;
import com.esri.ges.core.geoevent.GeoEventDefinition;
import com.esri.ges.core.property.LabeledValue;
import com.esri.ges.core.property.PropertyDefinition;
import com.esri.ges.core.property.PropertyException;
import com.esri.ges.core.property.PropertyType;
import com.esri.ges.manager.geoeventdefinition.GeoEventDefinitionManager;
import com.esri.ges.processor.GeoEventProcessorDefinitionBase;

public class BufferProcessorDefinition extends GeoEventProcessorDefinitionBase {
	GeoEventDefinitionManager manager;
	private static final Log LOG = LogFactory
			.getLog(BufferProcessorDefinition.class);
	private String radSrcConstant="${com.esri.geoevent.solutions.processor.buffer.buffer-processor.RADIUS_SRC_CONSTANT_LBL}";
	private String radSrcEvent = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.RADIUS_SRC_EVENT_LBL}";
	private String lblRadSrc = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.LBL_RAD_SRC}";
	private String descRadSrc = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.DESC_RAD_SRC}";
	private String lblRad = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.LBL_RADIUS}";
	private String descRad = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.DESC_RADIUS}";
	private String lblRadFld = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.LBL_RADIUS_FLD}";
	private String descRadFld = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.DESC_RADIUS_FLD}";
	private String lblUnits = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.LBL_UNITS}";
	private String descUnits = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.DESC_UNITS}";
	private String lblWKIDProc = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.LBL_WKID_BUFFER}";
	private String descWKIDProc = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.DESC_WKID_BUFFER}";
	private String lblWKIDOut = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.LBL_WKID_OUT}";
	private String descWKIDOut = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.LBL_WKID_OUT}";
	private String lblCenterSrc = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.LBL_CENTER_SRC}";
	private String descCenterSrc = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.DESC_CENTER_SRC}";
	private String centerSrcEvent = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.CENTER_SRC_EVENT_LBL}";
	private String centerSrcCoords = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.CENTER_SRC_COORD_LBL}";
	private String lblCenterX = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.LBL_CENTER_X}";
	private String descCenterX = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.DESC_CENTER_X}";
	private String lblCenterY = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.LBL_CENTER_Y}";
	private String descCenterY = "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.DESC_CENTER_Y}";
	
	public BufferProcessorDefinition() {

	}

	public void setManager(GeoEventDefinitionManager m) {
		try {
			this.manager = m;
			List<String> unitsAllowedTypes = new ArrayList<String>();
			unitsAllowedTypes.add("Meters");
			unitsAllowedTypes.add("Kilometers");
			unitsAllowedTypes.add("Feet");
			unitsAllowedTypes.add("Miles");
			unitsAllowedTypes.add("Nautical Miles");
			
			List<LabeledValue> allowedCenterSources = new ArrayList<LabeledValue>();
			allowedCenterSources.add(new LabeledValue(centerSrcEvent,"Event"));
			allowedCenterSources.add(new LabeledValue(centerSrcCoords,"Coordinates"));
			PropertyDefinition procCenterSource = new PropertyDefinition(
					"centerSrc", PropertyType.String, centerSrcEvent,
					lblCenterSrc, descCenterSrc, true, false, allowedCenterSources);
			propertyDefinitions.put(procCenterSource.getPropertyName(),
					procCenterSource);
			PropertyDefinition procX = new PropertyDefinition(
					"centerX", PropertyType.String, "",
					lblCenterX, descCenterX, false, false);
			procX.setDependsOn("centerSrc=Coordinates");
			propertyDefinitions.put(procX.getPropertyName(), procX);
			
			PropertyDefinition procY = new PropertyDefinition(
					"centerY", PropertyType.String, "",
					lblCenterY, descCenterY, false, false);
			procY.setDependsOn("centerSrc=Coordinates");
			propertyDefinitions.put(procY.getPropertyName(), procY);
			
			List<LabeledValue> allowedRadiusSources = new ArrayList<LabeledValue>();
			allowedRadiusSources.add(new LabeledValue(radSrcConstant,"Constant"));
			allowedRadiusSources.add(new LabeledValue(radSrcEvent,"Event"));
			PropertyDefinition procRadiusSource = new PropertyDefinition(
					"radiusSource", PropertyType.String, radSrcConstant,
					lblRadSrc, descRadSrc, true, false, allowedRadiusSources);
			propertyDefinitions.put(procRadiusSource.getPropertyName(),
					procRadiusSource);

			PropertyDefinition procRadius = new PropertyDefinition("radius",
					PropertyType.Double, 0, lblRad, descRad, false,
					false);
			procRadius.setDependsOn("radiusSource=Constant");
			propertyDefinitions.put(procRadius.getPropertyName(), procRadius);

			PropertyDefinition procRadiusEvent = new PropertyDefinition(
					"radiusEvent", PropertyType.String, "",
					lblRadFld,
					descRadFld, false, false);
			procRadiusEvent.setDependsOn("radiusSource=Event");
			//SetGeoEventAllowedFields(procRadiusEvent);
			propertyDefinitions.put(procRadiusEvent.getPropertyName(),
					procRadiusEvent);

			List<LabeledValue> unitsAllowedVals = new ArrayList<LabeledValue>();
			unitsAllowedVals.add(new LabeledValue("${com.esri.geoevent.solutions.processor.buffer.buffer-processor.UNITS_METERS_LBL}","Meters"));
			unitsAllowedVals.add(new LabeledValue("${com.esri.geoevent.solutions.processor.buffer.buffer-processor.UNITS_KM_LBL}","Kilometers"));
			unitsAllowedVals.add(new LabeledValue("${com.esri.geoevent.solutions.processor.buffer.buffer-processor.UNITS_FT_LBL}","Feet"));
			unitsAllowedVals.add(new LabeledValue("${com.esri.geoevent.solutions.processor.buffer.buffer-processor.UNITS_MILES_LBL}","Miles"));
			unitsAllowedVals.add(new LabeledValue("${com.esri.geoevent.solutions.processor.buffer.buffer-processor.UNITS_NM_LBL}","Nautical Miles"));
			PropertyDefinition procUnits = new PropertyDefinition("units",
					PropertyType.String, "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.UNITS_METERS_LBL}", lblUnits, descUnits,
					true, false, unitsAllowedVals);
			
			propertyDefinitions.put(procUnits.getPropertyName(), procUnits);

			PropertyDefinition procWKIDBuffer = new PropertyDefinition(
					"wkidbuffer", PropertyType.Integer, 3857, lblWKIDProc,
					descWKIDProc, true, false);
			propertyDefinitions.put(procWKIDBuffer.getPropertyName(),
					procWKIDBuffer);

			PropertyDefinition procWKIDOut = new PropertyDefinition("wkidout",
					PropertyType.Integer, 4326, lblWKIDOut,
					descWKIDOut, true, false);
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
		return "BufferProcessor";
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
		return "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.PROCESSOR_LABEL}";
	}

	@Override
	public String getDescription() {
		return "${com.esri.geoevent.solutions.processor.buffer.buffer-processor.PROCESSOR_DESCRIPTION}";
	}

	@Override
	public String getContactInfo() {
		return "geoeventprocessor@esri.com";
	}

}
