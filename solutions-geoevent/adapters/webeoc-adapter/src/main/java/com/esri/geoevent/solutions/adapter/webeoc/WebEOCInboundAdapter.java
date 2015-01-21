package com.esri.geoevent.solutions.adapter.webeoc;

import java.nio.ByteBuffer;

import com.esri.ges.adapter.AdapterDefinition;
import com.esri.ges.adapter.InboundAdapterBase;
import com.esri.ges.core.component.ComponentException;
import com.esri.ges.core.geoevent.GeoEvent;

public class WebEOCInboundAdapter extends InboundAdapterBase {

	public WebEOCInboundAdapter(AdapterDefinition definition)
			throws ComponentException {
		super(definition);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected GeoEvent adapt(ByteBuffer arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
