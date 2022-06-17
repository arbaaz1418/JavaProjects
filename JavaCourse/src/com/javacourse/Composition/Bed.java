package com.javacourse.Composition;

public class Bed {

	private String style;
	private int pillows;
	private int height;
	private int sheets;
	public Bed(String style, int pillows, int height, int sheets) {
		super();
		this.style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
	}
	public String getStyle() {
		return style;
	}
	public int getPillows() {
		return pillows;
	}
	public int getHeight() {
		return height;
	}
	public int getSheets() {
		return sheets;
	}
	
	public void make()
	{
		System.out.println("Bed->Making");
	}
}
