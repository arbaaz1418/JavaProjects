package com.javacourse.CodingExcercise;

public class DecimalComparator {

	public static void main(String[] args) {

		boolean result=areEqualByThreeDecimalPlaces(3.0,3.0);
		System.out.println(result);
	}
	public static boolean areEqualByThreeDecimalPlaces(double x, double y)
	{
		if((int)(x* 1000) ==(int)( y* 1000))
		{
			return true;
		}
		return false;
		
	}

}
