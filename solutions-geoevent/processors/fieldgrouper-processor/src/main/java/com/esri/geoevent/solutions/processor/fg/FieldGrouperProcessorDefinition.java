package com.esri.geoevent.solutions.processor.fg;

/*
 * #%L
 * FieldGrouperProcessorDefinition.java - fieldgrouper - Esri - 2013
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




import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.esri.ges.core.property.PropertyDefinition;
import com.esri.ges.core.property.PropertyException;
import com.esri.ges.core.property.PropertyType;
import com.esri.ges.manager.geoeventdefinition.GeoEventDefinitionManager;
import com.esri.ges.processor.GeoEventProcessorDefinitionBase;

public class FieldGrouperProcessorDefinition extends
		GeoEventProcessorDefinitionBase {
	//GeoEventDefinitionManager manager;
	private static final Log LOG = LogFactory.getLog(FieldGrouperProcessor.class);
	private String lblNumEvents = "${com.esri.geoevent.solutions.processor.fg.fieldgrouper.LBL_NUMBER_EVENTS}";
	private String descNumEvents = "${com.esri.geoevent.solutions.processor.fg.fieldgrouper.DESC_NUMBER_EVENTS}";
	private String lblGroupField = "${com.esri.geoevent.solutions.processor.fg.fieldgrouper.LBL_GROUP_FIELD}";
	private String descGroupField = "${com.esri.geoevent.solutions.processor.fg.fieldgrouper.DESC_GROUP_FIELD}";
	
	public FieldGrouperProcessorDefinition() throws PropertyException{
		PropertyDefinition pdNumInputs = new PropertyDefinition(
				"num-inputs",
				PropertyType.Integer,
				2, lblNumEvents, 
				descNumEvents,
				true, false);
		propertyDefinitions.put(pdNumInputs.getPropertyName(), pdNumInputs);

		PropertyDefinition pdGroupFieldName = new PropertyDefinition(
				"group-field", PropertyType.String, "", lblGroupField,
				descGroupField, true, false);
		//SetGeoEventAllowedFields(pdGroupFieldName);
		propertyDefinitions.put(pdGroupFieldName.getPropertyName(),
				pdGroupFieldName);
	}
	
	public String getName()
	{
		return "FieldGrouperProcessor";
	}

	@Override
	public String getDomain()
	{
		return "com.esri.geoevent.solutions.processor.fg";
	}

	@Override
	public String getVersion()
	{
		return "10.3.0";
	}

	@Override
	public String getLabel()
	{
		return "${com.esri.geoevent.solutions.processor.fg.fieldgrouper.PROCESSOR_LABEL}";
	}

	@Override
	public String getDescription()
	{
		return "${com.esri.geoevent.solutions.processor.fg.fieldgrouper.PROCESSOR_DESCRIPTION}";
	}

	@Override
	public String getContactInfo()
	{
		return "geoeventprocessor@esri.com";
	}
}
