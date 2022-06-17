package com.javacourse.Pasring;

public class ParsingValueFromString {

	public static void main(String[] args) {

		String numberAsString="2020.123";
		System.out.println("NumberAsString :"+numberAsString);
//		
//		int number= Integer.parseInt(numberAsString);
//		System.out.println("Number = "+number);
//		
		double doubleNumber= Double.parseDouble(numberAsString);
		System.out.println("Number = "+doubleNumber);
		
	}

}
