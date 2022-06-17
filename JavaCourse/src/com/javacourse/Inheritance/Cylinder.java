package com.javacourse.Inheritance;

public class Cylinder extends Circle {
	private double height;

	public Cylinder(double radius, double height) {
		super(radius);
		if(height <0)
		{
			this.height=0;
		}
		else{
		this.height = height;
		}
	}

	public double getHeight() {
		return height;
	}
	public double getVolume()
	{
		double volume= getArea()*height;
		return volume;
	}
	public static void main(String[] args)
	{
		Circle circle=new Circle(3.75);
		System.out.println("Radius :"+circle.getRadius());
		System.out.println("Area Of circle :"+circle.getArea());
		
		Cylinder cylinder=new Cylinder(5.55, 7.25);
		System.out.println("Radius :"+cylinder.getRadius());
		System.out.println("Height :"+cylinder.getHeight());
		System.out.println("Area :"+cylinder.getArea());
		System.out.println("Volume :"+cylinder.getVolume());
	}
}
