package com.javacourse.ControlFlowStatements;

public class SumFirstAndLastDigits {

	public static void main(String[] args)
	{
		System.out.println(sumFirstAndLastDigit(2345));
	}
	private static int sumFirstAndLastDigit(int number)
	{
		int firstDigit=0;
		int lastDigit=number % 10;
		
		if(number < 0)
		{
			return -1;
		}
		else if(number < 10)
		{
			return number+number;
		}

		number /= 10;
		while(number != 0)
		{
		 	firstDigit = number % 10;
		 	number /= 10;
		}
		return firstDigit + lastDigit;
	
	}
}
