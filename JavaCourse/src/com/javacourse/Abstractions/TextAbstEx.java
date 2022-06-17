package com.javacourse.Abstractions;

interface abc{
	public static void display() {
		System.out.println("Hello");
	}
}
abstract class Shape{
	String color;
	abstract double area() ;
	public abstract String toString();
	
	Shape(String color){
		System.out.println("Shape cons is called :");
		this.color=color;
	}
	String getColor() {
		return color;
	}
}
class Circle extends Shape implements abc{
	double radius;
	Circle(String color,double radius){
		super(color);
		System.out.println("Circle cons is called :");
		this.radius=radius;
	}
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	public String toString() {
		return "Color of Circle is "+super.getColor()+" and Area is : "+area();
	}
}

public class TextAbstEx{

	public static void main(String[] args) {
		Shape s=new Circle("Blue",5);
		System.out.println(s.toString());
	
	

	}

}
