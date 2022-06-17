package com.javacourse.CompositionPractice;

public class House {

	public static void main(String []  args)
	{
		Wall wall1=new Wall("EAST");
		Wall wall2=new Wall("WEST");
		Wall wall3=new Wall("NORTH");
		Wall wall4=new Wall("SOUTH");
		
		Ceiling ceiling= new Ceiling(12,55);
		Lamp lamp=new Lamp("Classic",false,75);
		Bed bed=new Bed("Modern",4,3,2,1);
		Bedroom bedroom = new Bedroom("Arbaz",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
		bedroom.makeBed();
		bedroom.getLamp().tunrOn();
	}
	
	
}
