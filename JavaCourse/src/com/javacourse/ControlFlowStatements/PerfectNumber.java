package com.javacourse.ControlFlowStatements;

public class PerfectNumber {

	public static void main(String[] args) {

		
		System.out.println(isPerfectNumber(-1));
	}
	public static boolean isPerfectNumber(int number)
	{
		if(number < 1)
		{
			return false;
		}
		int count=1;
		int tempNumber = number;
		int sum=0;
		while(tempNumber > count)
		{
			if(tempNumber % count == 0)
			{
				sum += count;
			}
			count++;
		}
		if(sum == number)
		{
			return true;
		}
		return false;
	}

}
