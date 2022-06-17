package DSA;

import java.util.Arrays;
import java.util.Scanner;

class KthElement
{
	
	private static int kthSmallest(int arr[],int n,int k)
	{
//		//sorting the array in asending order
//		int sortedArray[] = sortedArray(arr,n);
//		return sortedArray[k-1];
		int temp;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] > arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[k-1];
	}
//	
//	private static int[] sortedArray(int arr[],int n)
//	{
//		int temp;
//		for(int i=0;i<n-1;i++)
//		{
//			for(int j=i+1;j<n;j++)
//			{
//				if(arr[i] > arr[j])
//				{
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		printArray(arr, n);
//		return arr;
//	}
//	private static void printArray(int arr[], int n)
//	{
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(arr[i]);
//		}
//	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
//		int arr[]= {7,10,4,20,15};
		int t=sc.nextInt();
//		int n=5;
//		
//		int k=4;
//		System.out.println(kthSmallest(arr,n,k));
		while(t > 0)
		{
			int n=sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			
			int k=sc.nextInt();
			t--;
			System.out.println(kthSmallest(arr,n,k));
		}
		
	}
}