package com.esri.geoevent.solutions.transport.webeoc;
import com.esri.ges.core.component.ComponentException;
import com.esri.ges.transport.Transport;
import com.esri.ges.transport.TransportServiceBase;
import com.esri.ges.transport.util.XmlTransportDefinition;

public class WebEOCInboundTransportService extends TransportServiceBase {

	  public WebEOCInboundTransportService()
	  {
	    definition = new XmlTransportDefinition(getResourceAsStream("input-transport-transport-definition.xml"));
	  }
	  
	  public Transport createTransport() throws ComponentException
	  {
	    return new WebEOCInboundTransport(definition);
	  }

}
