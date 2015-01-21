package com.esri.geoevent.solutions.transport.webeoc;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.UUID;

import javax.xml.rpc.ServiceException;

import com.esri.geoevent.solutions.webeoc7.esi911.com.APILocator;
import com.esri.geoevent.solutions.webeoc7.esi911.com.APISoap;
import com.esri.geoevent.solutions.webeoc7.esi911.com.WebEOCCredentials;
import com.esri.ges.core.component.ComponentException;
import com.esri.ges.core.component.RunningState;
import com.esri.ges.transport.InboundTransportBase;
import com.esri.ges.transport.TransportContext;
import com.esri.ges.transport.TransportDefinition;

public class WebEOCInboundTransport extends InboundTransportBase implements Runnable{
	private String username = null;
	private String pw = null;
	private String webeocUrl = null;
	private String incident = null;
	private String board = null;
	private String position = null;
	private String view = null;
	private Integer pollingInterval = null;
	private APISoap apiSoap = null;
	private long lastTime = -1L;
	String channelId = null;
	WebEOCCredentials credentials = null;
	
	public WebEOCInboundTransport(TransportDefinition definition)
			throws ComponentException {
		super(definition);

	}
	@SuppressWarnings("incomplete-switch")
	@Override
	public synchronized void start()
	{
		switch(getRunningState())
		{
		case STARTING:
		case STARTED:
		case STOPPING:
			return;
		}
		APILocator api = null;
		URL soapEndpoint= null;
		try {
			api = new APILocator();
			soapEndpoint = new URL(webeocUrl);
			apiSoap = api.getAPISoap(soapEndpoint);
			credentials = new WebEOCCredentials();
			credentials.setUsername(username);
			credentials.setPassword(pw);
			credentials.setPosition(position);
			credentials.setIncident(incident);
			
		} catch (MalformedURLException e) {
			
		} catch (ServiceException e) {

		}
	}
	@Override
	public synchronized void stop()
	{
		//super.stop();
	}

	@Override
	public synchronized void afterPropertiesSet()
	{
		super.afterPropertiesSet();
		webeocUrl = getProperty("webeocUrl").getValueAsString();
		username = getProperty(username).getValueAsString();
		pw = getProperty("password").getValueAsString();
		incident = getProperty("incident").getValueAsString();
		position = getProperty("position").getValueAsString();
		board = getProperty("board").getValueAsString();
		view = getProperty("view").getValueAsString();
		pollingInterval = (Integer)getProperty("pollingInterval").getValue();
		
	}

	
	@Override
	public void onReceive(TransportContext context)
	{
		channelId = UUID.randomUUID().toString();
	}

	@Override 
	public void run()
	{
		setRunningState(RunningState.STARTED);
		while (isRunning())
		{
			String results = null;
			
			long timestamp = System.currentTimeMillis();
			if(lastTime < 0)
			{
				try {
					results = apiSoap.getData(credentials, board, view);
					if(results != null)
					{
						byte[] byteArray = results.getBytes();
						receive(byteArray);
					}
					lastTime = timestamp;
					
				} catch (RemoteException e) {
					
				}
			}
			else{ 
				if(timestamp - lastTime >= pollingInterval)
				{
					try {
						Calendar c = Calendar.getInstance();
						c.setTimeInMillis(lastTime);
						results = apiSoap.getUpdatedData(credentials, board, view, c);
						if(results != null)
						{
							byte[] byteArray = results.getBytes();
							receive(byteArray);
						}
						lastTime = timestamp;
					} catch (RemoteException e) {

					}
				}	
			}
			
		}
	}
	
	private void receive(byte[] bytes)
	{
		if (bytes != null && bytes.length > 0)
		{
			ByteBuffer bb = ByteBuffer.allocate(bytes.length);
			bb.put(bytes);
			bb.flip();
			byteListener.receive(bb, channelId);
			bb.clear();
		}
	}
}
