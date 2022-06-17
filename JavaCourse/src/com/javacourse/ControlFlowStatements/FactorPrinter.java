package com.javacourse.ControlFlowStatements;

public class FactorPrinter {

	public static void main(String[] args) {

		printFactors(12);
	}
	public static void printFactors(int number)
	{
		if(number < 1)
		{
			System.out.println("Invalid Value");
		}
		else
		{
			int count = 1;
			while(number >=count)
			{
				
				if(number % count == 0)
				{
					System.out.println(count);
				}
				count ++;
			}
		}
	}

}
