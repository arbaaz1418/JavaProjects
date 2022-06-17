package com.javacourse.ControlFlowStatements;

public class NumberToWords {

	public static void main(String[] args) {

		numberToWords(101);
//		System.out.println(getDigitCount(11));
	}

	public static void numberToWords(int number)
	{
		if(number < 0)
			System.out.println("Invalid Value");
		
		int lastDigit =0;
		int reverse=reverse(number);
		int reverseDigitCount=getDigitCount(reverse);
		int digitCOunt=getDigitCount(number);
		while(reverse != 0)
		{
			lastDigit = reverse % 10;
			reverse /= 10;
			digitCOunt--;
			switch (lastDigit) {
	          case 1:
	            System.out.println("One");
	            break;
	          case 2:
	            System.out.println("Two");
	            break;
	          case 3:
	            System.out.println("Three");
	            break;
	          case 4:
	            System.out.println("Four");
	            break;
	          case 5:
	            System.out.println("Five");
	            break;
	          case 6:
	            System.out.println("Six");
	            break;
	          case 7:
	            System.out.println("Seven");
	            break;
	          case 8:
	            System.out.println("Eight");
	            break;
	          case 9:
	            System.out.println("Nine");
	            break;
	          case 0:
	            System.out.println("Zero");
	        }
		}
		while(digitCOunt > 0)
		{
			digitCOunt--;
			System.out.println("Zero");
		}
	}
	
	
	public static int reverse(int number)
	{
		int reverse=0;
		while(number != 0)
		{
			int remainder = number % 10;
			reverse *= 10;
			reverse += remainder;
			number /= 10;
		}
		return reverse;
	}
	public static int getDigitCount(int number)
	{
		if(number < 0)
		{
			return -1;
		}
		int count=0;
		if(number==0)
		{
			return 1;
		}
		while(number != 0)
		{
			count++;
			number /= 10;
		}
		return count;
	}
}
