package com.javacourse.ReadingInput;

import java.util.Scanner;

public class ReadUserInputChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int count=1;
		int sum=0;
		while(count <= 10)
		{
			System.out.println("Enter number #"+count+":");
			boolean hasNextInt=scan.hasNextInt();
			if(hasNextInt){
				sum += scan.nextInt();
				count++;
			}
			else{
				System.out.println("Invalid Value ");
			}
			scan.nextLine();
		}
		System.out.println("Sum of all number is : "+sum);
		scan.close();
	
		
		
		

	}

}
