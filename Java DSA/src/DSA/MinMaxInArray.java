package DSA;


public class MinMaxInArray {

	private static int min;
	private static int max;
	
	public static void getMinMax(int arr[])
	{
		int arrLen=arr.length;
		//if array has only 1 element in it
		if(arrLen == 1)
		{
			min=arr[0];
			max=arr[0];
			
		}
		//assigning min & max values to first two elements
		else if(arr[0] > arr[1])
		{
			max=arr[0];
			min=arr[1];
		}
		else
		{
			min=arr[0];
			max=arr[1];
		}
		
		for(int i=2;i<arrLen;i++)
		{
			if(arr[i] > max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
		}
	}
	private static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {

		int arr[] = {1000,9};//, 11, 445, 1, 330, 3000};
		
		getMinMax(arr);
		printArray(arr);
		System.out.println("\nMinimum element in Array :"+min);
		System.out.println("Maximum element in Array :"+max);
	}

}
