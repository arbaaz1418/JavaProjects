package com.javacourse.Composition;

public class Lamp {

	private String style;
	private boolean battery;
	private int globRating;
	public Lamp(String style, boolean battery, int globRating) {
		super();
		this.style = style;
		this.battery = battery;
		this.globRating = globRating;
	}
	public String getStyle() {
		return style;
	}
	public boolean isBattery() {
		return battery;
	}
	public int getGlobRating() {
		return globRating;
	}
	
	public void turnOn()
	{
		System.out.println("Lamp_> turning on");
	}
}
