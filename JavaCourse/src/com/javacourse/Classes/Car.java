package com.javacourse.Classes;

public class Car {

	private int wheels;
	private int doors;
	private String model;
	private String Engine;
	private String colour;
	
	public void setModel(String model)
	{
		if(model.equalsIgnoreCase("caynnene"))
		{
			this.model=model;
		}
		else
		{
			this.model="Check Spelling";
		}
	}
	public String getModel()
	{
		return model;
	}
}
