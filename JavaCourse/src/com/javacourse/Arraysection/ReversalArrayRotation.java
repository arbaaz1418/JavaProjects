package com.javacourse.Arraysection;

public class ReversalArrayRotation {

	public static void leftRotate(int arr[],int d)
	{
		if(d==0)
			return;
		
		int n=arr.length;
		
		d %=n;
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,n-1);
		reverseArray(arr,0,n-1);
		
	}
	public static void reverseArray(int arr[],int start,int end)
	{
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7};
		int n=2;
		leftRotate(arr,n);
		printArray(arr);
		}
	
}
