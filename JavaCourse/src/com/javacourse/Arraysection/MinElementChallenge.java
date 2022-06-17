package com.javacourse.Arraysection;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {

	private static Scanner scan=new Scanner(System.in);
	
	public static int[] readIntegers(int count)
	{
		int[] readIntegers = new int[count];
		for(int i=0;i<readIntegers.length;i++)
		{
			readIntegers[i] = scan.nextInt();
		}
		return readIntegers;
	}
	public static int findMin(int[] array)
	{
		int[] findMin=Arrays.copyOf(array, array.length);
		int minElement=Integer.MAX_VALUE;
		int temp=0;
		for(int i = 0;i<findMin.length;i++)
		{
			if(findMin[i]<minElement)
			{
				minElement=findMin[i];
			}
		}
		return minElement;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter size of array");
		int size=scan.nextInt();
		
		int[] findMin=readIntegers(size);
		System.out.println("Min Element from array is :"+findMin(findMin));
		
		
		
		
		
		
		
	}

	
}
