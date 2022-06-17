package com.javacourse.CodingExcercise;

public class SpeedConverter {

	public static void main(String[] args) {

		printConversion(0.0);
	}

	public static long toMilesPerHour(double kilometerPerHour)
	{
		if(kilometerPerHour < 0)
		{
			return -1;
		}
		return Math.round(kilometerPerHour/1.609);
	}
	
	public static void printConversion(double kilometersPerHour)
	{
		if(kilometersPerHour<0)
		{
			System.out.println("Invalid Value");
		}
		else
		{
			long roundedResult=toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour+" km/h = "+roundedResult+" mi/h");	
		}
	}
}
