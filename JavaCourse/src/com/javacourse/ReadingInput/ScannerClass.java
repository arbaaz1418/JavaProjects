package com.javacourse.ReadingInput;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter you year of birth");
		boolean hasNextInt=scan.hasNextInt();
		if(hasNextInt)
		{
			int yearOfBirth=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter your Name :");
			String name=scan.nextLine();
			
			int age=2020-yearOfBirth;
			if(age >= 0 && age <=100)
			{
				System.out.println("Your name is "+name+ " and you are "+age+" years old");
			}
			else
			{
				System.out.println("Invalid Value of birth");
			}
		}
		else
		{
			System.out.println("Invalid value");
		}
		scan.close();

	}

}
