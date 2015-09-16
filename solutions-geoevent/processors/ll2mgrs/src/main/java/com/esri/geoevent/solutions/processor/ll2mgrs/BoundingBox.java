package com.esri.geoevent.solutions.processor.ll2mgrs;

public class BoundingBox
{
	double xmin, ymin, xmax, ymax;
	public BoundingBox(double xmin, double ymin, double xmax, double ymax)
	{
		this.xmin = xmin;
		this.ymin = ymin;
		this.xmax = xmax;
		this.ymax = ymax;
	}
	
	public double getXMin()
	{
		return xmin;
	}
	public double getYMin()
	{
		return ymin;
	}
	public double getXMax()
	{
		return xmax;
	}
	public double getYMax()
	{
		return ymax;
	}
}
