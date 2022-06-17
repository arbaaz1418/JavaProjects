package com.javacourse.Arraysection;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ArrayExample {

	private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] myInt=getIntergs(5);
		
		for(int i=0;i<myInt.length;i++)
		{
			System.out.println("Element "+i+" , value typed was "+myInt[i]);
		}
		System.out.println("Average if elements is "+getAverage(myInt));
	}

	public static int[] getIntergs(int number)
	{
		System.out.println("Enter "+number+" integer values.\r");
		int[] values =new int[number];	
		
		for(int i=0;i<values.length;i++)
		{
			values[i]=scan.nextInt();
		}
		return values;
	}
	
	public static double getAverage(int[] array)
	{
		
//		List<E> list= new Vector<E>();
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum += array[i];
		}
		return (double)(sum / array.length);
	}
}
