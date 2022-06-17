package com.javacourse.Arraysection;

import java.util.Arrays;

public class ReverseArray {

	public static void reverse(int[] nonReverse)
	{
		int[] reverse=Arrays.copyOf(nonReverse, nonReverse.length);
		int length=reverse.length;
		int temp=0;
		for(int i=0;i<reverse.length/2;i++)
		{			
			temp=reverse[i];
			reverse[i]=reverse[(length-1)-i];
			reverse[(length-1)-i]=temp;
		}
		System.out.println(Arrays.toString(reverse));
	}
	public static void main(String[] args) {

		int[] nonReversedArray = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(nonReversedArray));
		System.out.println("----------------------------------------------------------");
		reverse(nonReversedArray);
	
	}

}
