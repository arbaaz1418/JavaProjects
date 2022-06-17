package DSA;

import java.util.Scanner;

public class KthSmallestElementUsingRecursiveMergeSort {

	public static int kthElement(int arr[],int l,int r,int k)
	{
		int sortedArray[]=sort(arr,l,r);
		return sortedArray[k-1];
	}
	public static void merge(int arr[], int l,int m,int r)
	{
		//finding length of temp array
		int len1=m-l+1;
		int len2=r-m;
		
		//creating 2 temp arrays
		int L[]=new int[len1];
		int R[]=new int[len2];
		
		//coping element in temp arrays
		for(int i=0;i<len1;i++)
			L[i]=arr[l+i];
		for(int j=0;j<len2;j++)
			R[j]=arr[m+1+j];
		
		//merge temp array
		int i=0,j=0;
		int k=l;
		while(i<len1 && j<len2)
		{
			if(L[i]<=R[j])
			{
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		//checking if any element is left in L
		while(i<len1)
		{
			arr[k]=L[i];
			i++;
			k++;
		}
		//checking if any element is left in R
		while(i<len1)
		{
			arr[k]=R[j];
			j++;
			k++;
		}
	}
	public static void printArray(int arr[])
	{
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");	
		}
		System.out.println();
	}
	public static int[] sort(int arr[],int l,int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;
			sort(arr,l,m);//l=0,m=0
			sort(arr,m+1,r);//m=1,r=1
			merge(arr,l,m,r);//
		}
		return arr;
	}
	public static void main(String[] args) {

//		2
//		6
//		7 10 4 3 20 15
//		3
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
			System.out.println(kthElement(arr,0,n-1,k));
		}
//		int arr[]= {7,10,4,3,20,15};
//		int k=3;
//		int n=6;
//		
//		System.out.println(kthElement(sort(arr, 0, n-1), k));
////		sort(arr,0,n-1);
//		printArray(arr);
		
	}

}
