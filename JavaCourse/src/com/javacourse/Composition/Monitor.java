package com.javacourse.Composition;

public class Monitor {

	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativResolution;
	public Monitor(String model, String manufacturer, int size,
			Resolution nativResolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativResolution = nativResolution;
	}
	
	public void drawPixelAt(int x,int y,String color)
	{
		System.out.println("Drawing pixel at "+x+","+y+" in color "+color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativResolution() {
		return nativResolution;
	}
	
}
