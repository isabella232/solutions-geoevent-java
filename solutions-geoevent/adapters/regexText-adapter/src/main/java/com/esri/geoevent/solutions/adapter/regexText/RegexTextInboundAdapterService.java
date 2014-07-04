package com.esri.geoevent.solutions.adapter.regexText;

import com.esri.ges.adapter.Adapter;
import com.esri.ges.core.component.ComponentException;
import com.esri.ges.adapter.text.TextInboundAdapterService;
import com.esri.ges.adapter.util.XmlAdapterDefinition;

public class RegexTextInboundAdapterService extends TextInboundAdapterService
{
	public RegexTextInboundAdapterService()
	{
	  super();
	  definition = new XmlAdapterDefinition(getResourceAsStream("inboundadapter-definition.xml"));
	}
	
	@Override
	public Adapter createAdapter() throws ComponentException
	{
	  return new RegexTextInboundAdapter(definition);
	}
}