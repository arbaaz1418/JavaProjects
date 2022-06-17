package com.javacourse.ReadingInput;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputThenPrintSumAndAvg();
		
	}
	public static void inputThenPrintSumAndAvg()
	{
		Scanner scan=new Scanner(System.in);
		int sum=0;
		long average=0;
		int count=1;
		while(true)
		{
			boolean hasInt=scan.hasNextInt();
			if(hasInt)
			{
				int number=scan.nextInt();
				sum +=number;				
			}
			else
			{
				if(count==1)
				{
					System.out.println("SUM = "+sum+" AVG = "+average);
					break;
				}
				average=Math.round((double)sum/count);
				System.out.println("SUM = "+sum+" AVG = "+average);
				break;
			}
			count++;
			scan.nextLine();
		}
	}

}
