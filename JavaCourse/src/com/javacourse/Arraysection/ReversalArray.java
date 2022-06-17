package com.javacourse.Arraysection;

public class ReversalArray {
	
	static void leftRotate(int arr[], int d) {
		int n=arr.length;
		d=d%n;
		if(d==0)
			return;
		
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,n-1);
		reverseArray(arr,0,n-1);
		
	}
	static void reverseArray(int arr[],int start,int end) {
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

	static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
 
    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int d = 11;
 
//        leftRotate(arr, d); // Rotate array by d
//        printArray(arr);
        
        String str="ABCD";
        String str1="ABCD";
        int out=str.compareTo(str1);
		str.charAt(1);
//		System.out.println(str.substring(0, 1));
		System.out.println(out);
    }

}
