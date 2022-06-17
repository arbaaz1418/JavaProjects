package com.javacourse.InheritencePractice;

public class Vehicle {

	
	private String name;
	private int size;
	private int direction;
	private int speed;
	
	public Vehicle(String name,int size)
	{
		this.name=name;
		this.size=size;
		this.direction=0;
		this.speed=0;
	}
	public void steer(int direction)
	{
		this.direction +=direction;
		System.out.println("Vehicle.steer() : steering at "+this.direction);
	}
	public void move(int direction , int speed)
	{
		
	}
	public int getDirection()
	{
		return this.direction=direction;
	}
	public int getSpeed()
	{
		return this.speed=speed;
	}
}
