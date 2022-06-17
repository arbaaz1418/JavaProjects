package DSA;

public class ReverseArray {

	private static int[] reverseArray(int[] arr)
	{
		int arrLen=arr.length;
		int [] reverseArray=new int[arrLen];
		int d=arrLen-1;
		for(int i=0;i<=arrLen-1;i++)
		{
			reverseArray[i]=arr[d-i];
		}
		return reverseArray;
	}
	//Utility Methodasasda
	private static void printArray(int[] arr)
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {

		int [] arr = {1,5,3,7,2,6,5};
		System.out.print("Original Array : ");
		printArray(arr);
		System.out.print("\nReverse Array : ");
		printArray(reverseArray(arr));
		
	}

}
