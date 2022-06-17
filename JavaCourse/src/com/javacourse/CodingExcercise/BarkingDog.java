package com.javacourse.CodingExcercise;

public class BarkingDog {

	public static void main(String[] args) {
		boolean result=shouldWakeUp(true, 22);
		System.out.println(result);
	}
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay)
	{
		if(hourOfDay<0 || hourOfDay>23)
		{
			return false;
		}
		else if((barking) && (hourOfDay < 8 || hourOfDay >22))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	
	}

}
