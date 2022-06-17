package com.javacourse.ReadingInput;

import java.util.Scanner;

public class MinMaxInputChallenge {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		int number=0;
		int min=0;
		int max=0;
//		int min=2147483647;
//		int max=-2147483648;
		boolean flag=true;
		while(true)
		{
			System.out.println("Enter Number :");
			boolean hasNextInt=scan.hasNextInt();
			if(hasNextInt)
			{
				number=scan.nextInt();
				if(flag)
				{
					flag=false;
					max=number;
					min=number;
				}
	
				if(number > max)
				{
					max=number;
				}
				else if(number < min)
				{
					min=number;
				}
			}
			else
			{
				System.out.println("Max :"+max);
				System.out.println("Min :"+min);
				break;
			}
			scan.nextLine();

			
		
		}
		

	}

}
