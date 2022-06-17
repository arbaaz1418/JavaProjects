package com.javacourse.ControlFlowStatements;

public class SumDigits {

	public static void main(String[] args) {

		System.out.println(sumDigits(-12));
	}
	public static int sumDigits(int number)
	{		
		if(number < 10)
		{
			return -1;
		}
		int remain=0;
		int sum=0;
		while(number != 0)
		{
			remain=number % 10;
			number /=10;
			sum += remain;
		}
		return sum;

//		int remain=0;
//		int sum=0;
//		if(number >= 10)
//		{
//			while(number != 0)
//			{
//				remain=number % 10;
//				number /=10;
//				sum += remain;
//			}
//		}
//		else if(number < 10)
//		{
//			return -1;
//		}
//		return sum;
	}

}
