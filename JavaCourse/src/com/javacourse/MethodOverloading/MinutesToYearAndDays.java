
package com.javacourse.MethodOverloading;

public class MinutesToYearAndDays {

	public static void main(String[] args) {

		printYearsAndDays(-525600);
		
	}
	public static void printYearsAndDays(long minutes)
	{
		if(minutes < 0)
		{
			System.out.println("Invalid Value");
		}
		else
		{
		long hours=(minutes /60);//it will give us hours
		long days=(hours / 24);///it will give years
		long years=(days / 365);
		long remaingDays = (days % 365);
//		long remainingHours= ( remaingDays * 24 ) / 60;
//		long remainingMinutes=(remainingHours % 60);
//		
		System.out.println(minutes+" min = "+years+" y and "+remaingDays+" d");// and "+remainingHours+" h and "+remainingMinutes+" m");
	
		}
	}

}
