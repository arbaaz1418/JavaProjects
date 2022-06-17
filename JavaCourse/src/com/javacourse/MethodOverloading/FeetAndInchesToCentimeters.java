package com.javacourse.MethodOverloading;

public class FeetAndInchesToCentimeters {

	public static void main(String[] args) {

		calcFeetAndInchesToCentimeters(-10);//inches
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches)
	{
		if((feet >= 0) && (inches >= 0 && inches <=12))
		{
			double centimeter=(feet*12) * 2.54;
			centimeter += inches* 2.54;
			System.out.println(feet+" feet, "+inches+" inches = "+centimeter+" cm");
			return centimeter;
		}
		else
		{
			return -1;
		}
	}
	public static double calcFeetAndInchesToCentimeters(double inches)
	{
		if(inches >= 0)
		{
			double feetFromInches=(int)(inches/12);
			double remainingInch=(int)(inches%12);
			System.out.println(inches+" inches equals "+feetFromInches+" feet and "+remainingInch+" inches");
			return calcFeetAndInchesToCentimeters(feetFromInches, remainingInch);
			
		}
		else
		{
			return -1;
		}
	}
	
}
