package com.javacourse.CodingExcercise;

public class LeapYear {

	public static void main(String[] args) {
//		for(int i=0;i<=9999;i++)
//		{
//			boolean result=isLeapYear(i);
//			System.out.println(i+" Year = "+result);
//		}
		boolean result=isLeapYear(1924);
		System.out.println(result);

	}
	public static boolean isLeapYear(int year){

//		if(((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0))
//		{
//			
//		}
		if(year >=1 && year <= 9999)
		{
			if(year%4==0)
			{  ///step 1
				if(year%100==0)
				{///step 2
					if(year%400 == 0)
					{//step3
						return true;///step 4
					}
					else
					{
						return false;
					}
				}
				else
				{
					return true;
				}
			}
			else
			{///step 5
				return false;
			}
		}
		
		return false;
		
	}

}
