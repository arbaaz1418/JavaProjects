package com.javacourse.PrimitiveTypes;

public class PoundsToKgConverter {

	public static void main(String[] args) {

		double pounds=100;
		int kg=12;
	
		double convertToKg=0.45359237d*pounds;
		
		double convertToPounds=0.45359237d/kg;
		System.out.println(convertToPounds);
		System.out.println(convertToKg);
	}

}
