package com.javacourse.ControlFlowStatements;

public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println(isPlaindrome(-121));
	}
	private static boolean isPlaindrome(int number)
	{
		int reverse=0;
		int lastDigit=0;
		int tempNumber=number;
		while(number != 0)
		{
			lastDigit = number % 10;
			reverse *= 10;
			reverse += lastDigit;
			number /= 10;
		}
		System.out.println(reverse);
		if(reverse == tempNumber)
		{
			return true;
		}
		return false;
	}

}
