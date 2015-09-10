package com.esri.geoevent.solutions.processor.ll2mgrs;

import com.esri.geoevent.solutions.processor.ll2mgrs.BoundingBox;

public class LL {
	private double lat;
	private double lon;
	private Integer accuracy = null;
	private BoundingBox bb = null;

	LL(double lat, double lon) {
		this.lat = lat;
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public double getLon() {
		return lon;
	}
	
	public Integer getAccuracy()
	{
		return this.accuracy;
	}
	
	public void setAccuracy(Integer a)
	{
		accuracy = a;
	}
	
	public BoundingBox getBoundingBox()
	{
		return bb;
	}
	
	public void setBoundingBox(BoundingBox bb)
	{
		this.bb = bb;
	}
	
	
}
