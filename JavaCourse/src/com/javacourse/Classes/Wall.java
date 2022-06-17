package com.javacourse.Classes;

public class Wall {

	private double width;
	private double height;
	
	public Wall() {
	}
	public Wall(double width, double height) {
		setWidth(width);
		setHeight(height);
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width<0)
		{
			this.width=0.0;
		}
		else
		{
			this.width = width;
		}
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height < 0)
		{
			this.height=0.0;
		}
		else
		{
			this.height = height;
		}
	}
	public double getArea()
	{
		return width*height;
	}
	public static void main(String[] args) {

		Wall wall= new Wall(-5,-4);
		System.out.println("Area Of wall :"+wall.getArea());
		
		wall.setHeight(-20.0);
		System.out.println("Width :"+wall.getWidth());
		System.out.println("Height :"+wall.getHeight());
		System.out.println("Area Of wall :"+wall.getArea());
	}

}
