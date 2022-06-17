package com.javacourse.ControlFlowStatements;

import java.sql.Time;

public class LastDigitChecker {

	public static void main(String[] args) {

		long startTime=System.currentTimeMillis();
		System.out.println(startTime);
		System.out.println(hasSameLastDigit(12,34,522));
		long endTime=System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println("Ending Time "+(endTime - startTime));
	}
	
	public static boolean hasSameLastDigit(int num1, int num2, int num3)
	{
//		if((num1 <= 10 || num1 >=1000) || (num2 <= 10 || num2 >= 1000) || (num3 <= 10 || num3 >= 1000))
//		{
//			return false;
//		}
		if((isValid(num1)) && (isValid(num2)) && (isValid(num3)))
		{
			int lastDigit1=0;
			int lastDigit2=0;
			int lastDigit3=0;
			int tempNumber1=0;
			int tempNumber2=0;

			
//			lastDigit1 = num1 % 10;
//			lastDigit2 = num2 % 10;
//			lastDigit3 = num3 % 10;
//			
//			if((lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit2 == lastDigit3))
//			{
//				return true;
//			}
//			return false;
			while(num1 != 0)
			{
				lastDigit1 = num1 % 10;//lastDigit1=1
				tempNumber1= num1;//tempnumber1=41
				while(tempNumber1 != 0)
				{
//					System.out.println("Inside 1st while");
					lastDigit2 = num2 % 10;//lastdigit2=2
					tempNumber2= num2;//tempnumber2= 22
					while(tempNumber2 != 0)
					{
//						System.out.println("Inside 2nd while");
						lastDigit3 = num3 % 10;//lastdigit2=1
						if((lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit2 == lastDigit3))
						{
							return true;
						}
						
						tempNumber2 /= 10;//tempnumber2= 2
					}
					tempNumber1 /= 10;
				}
				num1 /= 10;
			}
		}
		return false;
		
	}
	public static boolean isValid(int number)
	{
		if((number >=10) && (number <= 1000))
		{
			return true;
		}
		return false;
		
	}

}
