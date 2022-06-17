package com.javacourse.ControlFlowStatements;

public class GreatestCommonDivisor {

	public static void main(String[] args) {

		System.out.println("Greatest Common Divisor :"+getGreatestCommonDivisor(1010,10));
	}
	public static int getGreatestCommonDivisor(int first, int second)
	{
		int temp=0;
		if((first < 10) || (second <10))
		{
			return -1;
		}
		int minimum= first < second ? first : second;
		
		for(int i=1; i<=minimum;i++)
		{
			if((first % i == 0) && (second % i == 0))
			{
				if(temp < i)
				{
					temp=i;
				}
			}
		}
		return temp;
	}

}
