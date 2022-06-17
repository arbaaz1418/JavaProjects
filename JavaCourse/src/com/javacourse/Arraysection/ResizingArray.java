package com.javacourse.Arraysection;

import java.util.Scanner;

public class ResizingArray {

	public static Scanner scan=new Scanner(System.in);
	public static int[] baseDataArray=new int[10];
	
	public static void getInput()
	{
		for(int i=0;i<baseDataArray.length;i++)
		{
			baseDataArray[i]=scan.nextInt();
		}
	}
	public static void printArray(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	private static void resizeArray()
	{
		int[] originalArray=baseDataArray;
		baseDataArray=new int[12];
		for(int i=0;i<originalArray.length;i++)
		{
			baseDataArray[i]=originalArray[i];
		
		}
	}
	public static void main(String[] args) {

		System.out.println("Enter 10 digits1");
		getInput();
		printArray(baseDataArray);
		resizeArray();
		baseDataArray[10]=11;
		baseDataArray[11]=12;
		printArray(baseDataArray);
		
		
	}

}
