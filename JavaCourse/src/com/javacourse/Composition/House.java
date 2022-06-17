package com.javacourse.Composition;

public class House {

	public static void main(String args[])
	{
		Wall wall1= new Wall("North");
		Wall wall2= new Wall("East");
		Wall wall3= new Wall("West");
		Wall wall4= new Wall("South");
		
		Ceiling ceiling = new Ceiling(12,32);
		Bed bed= new Bed("Modern",2,6,1);
		Lamp lamp=new Lamp("Classic",false,2);
		
		Bedroom bedroom=new Bedroom("Arbaz's Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		bedroom.makeBed();
		bedroom.getLamp().turnOn();
	}
}
