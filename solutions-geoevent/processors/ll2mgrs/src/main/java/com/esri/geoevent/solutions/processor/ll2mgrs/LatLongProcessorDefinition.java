package com.esri.geoevent.solutions.processor.ll2mgrs;

import com.esri.ges.core.property.PropertyDefinition;
import com.esri.ges.core.property.PropertyException;
import com.esri.ges.core.property.PropertyType;
import com.esri.ges.processor.GeoEventProcessorDefinitionBase;

public class LatLongProcessorDefinition extends GeoEventProcessorDefinitionBase{
	private String lblMGRS = "${com.esri.geoevent.solutions.processor.ll2mgrs.ll2mgrs-processor.LBL_MGRS}";
	private String descMGRS= "${com.esri.geoevent.solutions.processor.ll2mgrs.ll2mgrs-processor.DESC_MGRS}";
	private String lblGeoField = "${com.esri.geoevent.solutions.processor.ll2mgrs.ll2mgrs-processor.LBL_GEO_FLD}";
	private String descGeoField= "${com.esri.geoevent.solutions.processor.ll2mgrs.ll2mgrs-processor.DESC_GEO_FLD}";
	private String lblNewDef = "${com.esri.geoevent.solutions.processor.ll2mgrs.ll2mgrs-processor.LBL_NEW_DEF}";
	private String descNewDef = "${com.esri.geoevent.solutions.processor.ll2mgrs.ll2mgrs-processor.DESC_NEW_DEF}";
	private String lblAccuracy = "${com.esri.geoevent.solutions.processor.ll2mgrs.ll2mgrs-processor.LBL_ACCURACY}";
	private String descAccuracy= "${com.esri.geoevent.solutions.processor.ll2mgrs.ll2mgrs-processor.DESC_ACCURACY}";
	private String lblOverwrite = "${com.esri.geoevent.solutions.processor.ll2mgrs.ll2mgrs-processor.LBL_OVERWRITE}";
	private String descOverwrite= "${com.esri.geoevent.solutions.processor.ll2mgrs.ll2mgrs-processor.DESC_OVERWRITE}";
	public LatLongProcessorDefinition() throws PropertyException
	{
		propertyDefinitions.put("mgrs", new PropertyDefinition("mgrs", PropertyType.String, "", lblMGRS, descMGRS, true, false));
		propertyDefinitions.put("eventdef", new PropertyDefinition("eventdef", PropertyType.String, "", lblNewDef, descNewDef, true, false));
		propertyDefinitions.put("overwrite", new PropertyDefinition("overwrite", PropertyType.Boolean, true, lblOverwrite, descOverwrite, true, false));
		propertyDefinitions.put("geofld", new PropertyDefinition("geofld", PropertyType.String, "", lblGeoField, descGeoField, "overwrite=false", true, false));
		propertyDefinitions.put("accuracy", new PropertyDefinition("accuracy", PropertyType.Integer, null, lblAccuracy, descAccuracy, false, false));
	}
	@Override
	public String getName() {
		return "MGRS2LL";
	}

	@Override
	public String getDomain() {
		return "com.esri.geoevent.solutions.processor.ll2mgrs";
	}

	@Override
	public String getVersion() {
		return "10.3.1";
	}

	@Override
	public String getLabel() {
		return "MGRS to Lat Long Converter";
	}

	@Override
	public String getDescription() {
		return "Converts MGRS coordinates to Lat / Lon. Returns southwest corner of MGRS or a bounding box ";
	}

	@Override
	public String getContactInfo() {
		return "geoeventprocessor@esri.com";
	}

}
