package com.javacourse.OopChallenge;

public class Extras {
	
	private int price;
	private String name;
	public Extras(String name,int price) {
		super();
		this.price = price;
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
	
	
	

}
