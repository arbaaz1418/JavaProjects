package com.javacourse.ControlFlowStatements;

public class WhileLoop {

	public static void main(String[] args) {

//		System.out.println(isEvenNumber(10));
//		int count=1;
//		while(count != 6)
//		{
//			System.out.println(count);
//			count++;
//		}
//		count=1;
//		while(true)
//		{
//			if(count == 6)
//			{
//				break;
//			}
//			System.out.println(count);
//			count++;
//		}
//		count =1;
//		do
//		{
//			System.out.println(count);
//			count++;
//		}while(count != 6);
//		
//		
		int start=4;
		int finish=20;
		int totalEvenNumber=0;
		int sumEven=0;
		while(start <= finish)	
		{
			start++;
			if(!isEvenNumber(start))
			{
				continue;
			}
			System.out.println(start);
			totalEvenNumber++;//5
			sumEven += start;//6+8+10+12+14
			if(totalEvenNumber == 5)
			{
				break;
			}
			
		}
		System.out.println(sumEven);
	}
	public static boolean isEvenNumber(int number)
	{
		if(number % 2 ==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
