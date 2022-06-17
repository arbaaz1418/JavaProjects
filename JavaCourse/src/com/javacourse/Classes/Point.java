package com.javacourse.Classes;

public class Point {

	int x;
	int y;
	
	public Point() {
		this(0,0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distance()
	{
		return distance(0,0);
	}
	public double distance(int a, int b)
	{
		return Math.sqrt(((x-a)*(x-a))+((y-b)*(y-b)));
	}
	public double distance(Point p)
	{
//		return Math.sqrt(((this.x-p.x)*(this.x-p.x))+((this.y-p.y)*(this.y-p.y)));
		return distance(p.getX(),p.getY());
	}
	public static void main(String[] args) {

		Point one=new Point(6,5);
		Point two=new Point(3,1);
		
		System.out.println("distance(0,0)"+one.distance());
		System.out.println("distance(second)"+one.distance(two));
		System.out.println("distance(2,2)"+one.distance(2,2));
		
		Point p=new Point();
		System.out.println("distance()="+p.distance(1,1));
	}

}
