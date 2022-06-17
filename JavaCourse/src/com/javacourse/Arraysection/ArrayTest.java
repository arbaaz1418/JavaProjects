package com.javacourse.Arraysection;

public class ArrayTest {

	public static void main(String arg[])
	{
		///First way
		int [] intArray=new int[10];
		intArray[2]=10;
		
		///Second way
		int [] intArraySecWay={1,2,3,4};
		System.out.println(intArraySecWay[2]);
		
		///Third way
		int [] intArrayThirdWay=new int[10];
		int num= 0;
		for(int i=0;i<intArrayThirdWay.length;i++)
		{
			intArrayThirdWay[i]=num*2;
			num++;
		}
		printArray(intArrayThirdWay);
	}
	public static void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Element is "+i+" = "+array[i]);
		}
	}
}
