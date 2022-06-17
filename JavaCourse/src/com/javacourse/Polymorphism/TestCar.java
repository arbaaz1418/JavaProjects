package com.javacourse.Polymorphism;

class Car
{
	private String name;
	private boolean engine;
	private int numOfCylinders;
	private int wheels;
	public Car(String name, int numOfCylinders) {
		super();
		this.name = name;
		this.numOfCylinders = numOfCylinders;
		this.engine=true;
		this.wheels=4;
	}
	public String startEngine()
	{
		return "Car-> Starting engine!!!";
	}
	public String accelerate()
	{
		return "Car ->Accelerating;";
	}
	public String brake()
	{
		return "Car ->Brakes Applied";
	}
	public String getName() {
		return name;
	}
	public int getNumOfCylinders() {
		return numOfCylinders;
	}
	
}
class Ferrari extends Car
{
	public Ferrari(String name,int numOfCylinders)
	{
		super(name, numOfCylinders);
	}

	@Override
	public String startEngine() {
		return "Ferrari -> Start Engine";
	}

	@Override
	public String accelerate() {
		return "Ferrari -> Accelerating";
	}

	@Override
	public String brake() {
		return "Ferrari -> Brake applied";
	}
}

class Ford extends Car
{
	public Ford(String name,int numOfCylinders)
	{
		super(name, numOfCylinders);
	}

	@Override
	public String startEngine() {
		return "Ford -> Start Engine";
	}

	@Override
	public String accelerate() {
		return "Ford -> Accelerating";
	}

	@Override
	public String brake() {
		return "Ford -> Brake applied";
	}
}
class Jaguar extends Car
{
	public Jaguar(String name,int numOfCylinders)
	{
		super(name, numOfCylinders);
	}

	@Override
	public String startEngine() {
		return getClass().getSimpleName()+" -> Start Engine";
	}

	@Override
	public String accelerate() {
		return getClass().getSimpleName()+" -> Accelerating";
	}

	@Override
	public String brake() {
		return getClass().getSimpleName()+"-> Brake applied";
	}
}

public class TestCar {

	public static void main(String[] args) {

		Car car=new Car("Base Car", 2);
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		Ferrari ferrari=new Ferrari("Ferrari V8", 8);
		System.out.println(ferrari.startEngine());
		System.out.println(ferrari.accelerate());
		System.out.println(ferrari.brake());
		
		Ford ford=new Ford("Ford Endevour", 4);
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
		
		Jaguar jaguar=new Jaguar("Jaguar Caynnene", 4);
		System.out.println(jaguar.startEngine());
		System.out.println(jaguar.accelerate());
		System.out.println(jaguar.brake());
	}

}
