package com.esri.geoevent.solutions.processor.addxyz;

import com.esri.ges.core.property.PropertyDefinition;
import com.esri.ges.core.property.PropertyException;
import com.esri.ges.core.property.PropertyType;
import com.esri.ges.processor.GeoEventProcessorDefinitionBase;

public class AddXYZProcessorDefinition extends GeoEventProcessorDefinitionBase {

	public AddXYZProcessorDefinition() throws PropertyException {
		PropertyDefinition pdGeometryFieldName = new PropertyDefinition("geofield", PropertyType.String, "", "Geometry Field", "Geometry field from which the coordinate values will be derived", true, false);
		propertyDefinitions.put(pdGeometryFieldName.getPropertyName(), pdGeometryFieldName);
		
		PropertyDefinition pdGEDName = new PropertyDefinition("gedName", PropertyType.String, "", "GeoEvent Definition Name", "Name of the geoevent definition created", true, false);
		propertyDefinitions.put(pdGEDName.getPropertyName(), pdGEDName);
		
		PropertyDefinition pdXField = new PropertyDefinition("xfield", PropertyType.String, "x", "X-Field", "Field created to hold x-value", true, false);
		propertyDefinitions.put(pdXField.getPropertyName(), pdXField);
		
		PropertyDefinition pdYField = new PropertyDefinition("yfield", PropertyType.String, "y", "Y-Field", "Field created to hold y-value", true, false);
		propertyDefinitions.put(pdYField.getPropertyName(), pdYField);
		
		PropertyDefinition pdZField = new PropertyDefinition("zfield", PropertyType.String, "z", "Z-Field", "Field created to hold z-value", false, false);
		propertyDefinitions.put(pdZField.getPropertyName(), pdZField);
	}
	
	@Override
	public String getName() {
		return "AddXYZProcessor";
	}

	@Override
	public String getDomain() {
		return "com.esri.geoevent.solutions.processor.addxyz";
	}

	@Override
	public String getVersion() {
		return "10.2.0";
	}

	@Override
	public String getLabel() {
		return "Add XYZ Processor";
	}

	@Override
	public String getDescription() {
		return "Derives X, Y, and Z values from a point geometry and adds them as fields to a new geoevent";
	}

	@Override
	public String getContactInfo() {
		return "geoeventprocessor@esri.com";
	}


}
