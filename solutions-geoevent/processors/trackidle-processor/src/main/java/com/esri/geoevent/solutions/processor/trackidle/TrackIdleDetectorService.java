package com.esri.geoevent.solutions.processor.trackidle;

import com.esri.ges.core.component.ComponentException;
import com.esri.ges.manager.geoeventdefinition.GeoEventDefinitionManager;
import com.esri.ges.messaging.Messaging;
import com.esri.ges.processor.GeoEventProcessor;
import com.esri.ges.processor.GeoEventProcessorServiceBase;

public class TrackIdleDetectorService extends GeoEventProcessorServiceBase
{
  private Messaging messaging;
  private GeoEventDefinitionManager manager;
  public TrackIdleDetectorService()
  {
    definition = new TrackIdleDetectorDefinition();
  }

  @Override
  public GeoEventProcessor create() throws ComponentException
  {
    TrackIdleDetector detector = new TrackIdleDetector(definition);
    detector.setMessaging(messaging);
    detector.setManager(manager);
    return detector;
  }

  public void setMessaging(Messaging messaging)
  {
    this.messaging = messaging;
  }
  
  public void setManager()
  {
	  this.manager = manager;
  }
}