package com.esri.geoevent.solutions.processor.updateOnly;

import com.esri.ges.core.component.ComponentException;
import com.esri.ges.processor.GeoEventProcessor;
import com.esri.ges.processor.GeoEventProcessorServiceBase;

public class UpdateOnlyProcessorService extends GeoEventProcessorServiceBase
{
  public UpdateOnlyProcessorService()
  {
    definition = new UpdateOnlyProcessorDefinition();
  }

  @Override
  public GeoEventProcessor create() throws ComponentException
  {
    return new UpdateOnlyProcessor(definition);
  }
}