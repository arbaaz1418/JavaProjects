package com.javacourse.Arraysection;

public class ReverseArrayByNElements {
	
	public void rotateByNElement(int arr[],int e,int n) {
		e = e % n;
		System.out.println(e);
		for(int i=0; i< e;i++) 
			rotateArray(arr,n);
	}

	public void rotateArray(int arr[],int n) {
		int i,temp;
		temp=arr[0];
		for(i=0;i<n-1;i++)
			arr[i]=arr[i+1];
		
		arr[n-1]=temp;
	}
	void printArray(int [] arr) {
		for(int i:arr) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		ReverseArrayByNElements rev=new ReverseArrayByNElements();
		
		int arrToReverse[]= {1,2,3,4,5,6};
		rev.rotateByNElement(arrToReverse, 2, 6);
		rev.printArray(arrToReverse);
		

}
}