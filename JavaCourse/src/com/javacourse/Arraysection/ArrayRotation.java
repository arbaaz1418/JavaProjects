package com.javacourse.Arraysection;

public class ArrayRotation {

	public static void rotate(int [] arr,int d,int n)
	{
		int tempArr[]=arr;
		
		int i,j,temp=0;
		for(i=0;i<n;i++)
		{
			temp=tempArr[0];
			for(j=0;j<d-1;j++)
			{
				tempArr[j]=tempArr[j+1];
			}
			tempArr[j]=temp;	
		}
		
	}
	
	public static void printArray(int arr[],int d)
	{
		for(int i=0;i<d;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7};
		int d=arr.length;
		int n=2;
		rotate(arr,d,n);
		printArray(arr, d);
		}

}
