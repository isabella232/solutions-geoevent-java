package com.esri.geoevent.solutions.processor.timewindowsort;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.esri.arcgis.interop.Properties;
import com.esri.ges.core.property.PropertyDefinition;
import com.esri.ges.core.property.PropertyException;
import com.esri.ges.core.property.PropertyType;
import com.esri.ges.processor.GeoEventProcessorDefinitionBase;

public class TimeWindowSortProcessorDefinition extends
		GeoEventProcessorDefinitionBase {
	private static final Log LOG = LogFactory
			.getLog(TimeWindowSortProcessorDefinition.class);
	public TimeWindowSortProcessorDefinition() throws PropertyException
	{
		propertyDefinitions.put("interval", new PropertyDefinition("interval", PropertyType.Integer, 60000, "${com.esri.geoevent.solutions.processor.timewindowsort.timewindowsort-processor.LBL_INTERVAL}", "${com.esri.geoevent.solutions.processor.timewindowsort.timewindowsort-processor.DESC_INTERVAL}", false, true));
		propertyDefinitions.put("orderby", new PropertyDefinition("interval", PropertyType.Integer, 60000, "${com.esri.geoevent.solutions.processor.timewindowsort.timewindowsort-processor.LBL_SORT_FLD}", "${com.esri.geoevent.solutions.processor.timewindowsort.timewindowsort-processor.DESC_SORT_FLD}", false, true));
	}

}
