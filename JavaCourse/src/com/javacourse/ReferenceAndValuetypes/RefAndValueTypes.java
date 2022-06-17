package com.javacourse.ReferenceAndValuetypes;

import java.util.Arrays;

/**
 * @author Shinchan x
 *
 */
public class RefAndValueTypes {

	public static void main(String[] args) {

		
		int myInt = 10;
		int anotherInt = myInt;
		
		System.out.println("MYInt "+myInt);
		System.out.println("AnotherInt "+anotherInt);
				
		anotherInt++;
		System.out.println("MYInt "+myInt);
		System.out.println("AnotherInt "+anotherInt);
		
		int[] intArray = new int[5];
		int[] anotherIntArray = intArray;
		
		System.out.println("IntArray "+Arrays.toString(intArray));
		System.out.println("AnotherIntArray "+Arrays.toString(anotherIntArray));
		
		intArray[0]= 5;
//		anotherIntArray=new int[]{1,2,3,4,5};

		System.out.println("IntArray "+Arrays.toString(intArray));
		System.out.println("AnotherIntArray "+Arrays.toString(anotherIntArray));
		
	}

}
