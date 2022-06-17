package com.javacourse.Operators;

public class OperatorChallenge {

	public static void main(String[] args) {

		double num1=20.00;
		double num2=80.00;
		double result=(num1+num2)* 100;
		System.out.println("Total is "+result);
		
		double remainder=result % 40.00;
		System.out.println("Remainder is "+remainder);
		
		boolean myBoolean=(remainder == 0 )? true:false;
		System.out.println(myBoolean);
		if(myBoolean== false)
		{
			System.out.println("Got some remainder");
		}
	}

}
