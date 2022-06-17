package com.javacourse.Classes;

public class Floor {

	private double width;
	private double height;
	
	public Floor(double width, double height)
	{
		if(width < 0)
		{
			this.width=0;
		}
		this.width=width;
		if(height<0)
		{
			this.height=height;
		}
		this.height=height;
	}
	public double getArea()
	{
		return width*height;
	}
	

}
