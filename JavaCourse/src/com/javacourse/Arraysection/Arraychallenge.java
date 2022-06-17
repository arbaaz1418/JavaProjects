package com.javacourse.Arraysection;
import java.util.*;

import java.util.Scanner;

public class Arraychallenge {

	private static Scanner scan=new Scanner(System.in);
	
	public static int[] getInterges(int number)
	{
		System.out.println("Enter "+number+" integer values .");
		int[] unsortedArray=new int[number];
		for(int i=0;i<unsortedArray.length;i++)
		{
			unsortedArray[i]=scan.nextInt();
		}
		return unsortedArray;
	}
	public static void printArrays(int[] printArray)
	{
		for(int i=0;i<printArray.length;i++)
		{
			System.out.println("Elements are "+printArray[i]);
		}
	}
	
	public static int[] sortArray(int[] unsortedArray)
	{
		/*int[] sortedArray=new int[unsortedArray.length];
		for(int i=0;i<unsortedArray.length;i++)
		{
			sortedArray[i]=unsortedArray[i];
		}*/
		int[] sortedArray= Arrays.copyOf(unsortedArray, unsortedArray.length);
		int temp=0;
		boolean flag=true;
		while(flag)
		{
			flag=false;
			for(int i=0;i<sortedArray.length-1;i++)
			{
				if(sortedArray[i]<sortedArray[i+1])
				{
					temp=sortedArray[i];
					sortedArray[i]=sortedArray[i+1];
					sortedArray[i+1]=temp;
					flag=true;
				}
			}
		}
		return sortedArray;
	}
	public static void main(String[] args) {

		int[] myArray=getInterges(5);
		System.out.println("________UNSORTED ARRAY_______");
		printArrays(myArray);
		System.out.println("\n");
		System.out.println("________SORTED ARRAY_______");
		int[] sortedArray=sortArray(myArray);
		printArrays(sortedArray);
		
	}

}
