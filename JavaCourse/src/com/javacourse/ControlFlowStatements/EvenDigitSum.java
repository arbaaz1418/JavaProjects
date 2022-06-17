package com.javacourse.ControlFlowStatements;

public class EvenDigitSum {

	public static void main(String[] args) {

		System.out.println(getEvenDigitSum(3));
	}
	public static int getEvenDigitSum(int number)
	{
		if(number <0)
		{
			return -1;
		}
		int evenNumber=0;
		int sum=0;
		int lastDigit=0;
		
		while(number > 0)
		{
			lastDigit = number % 10;
			if(lastDigit % 2 == 0)
			{
				sum += lastDigit;
			}
			number /= 10;
		}
		return sum;
	}

}
