package com.javacourse.ControlFlowStatements;

public class LargestPrime {

	public static void main(String[] args) {

		System.out.println(getLargestPrime(21));
	}
	
	 public static int getLargestPrime(int number)
	    {
	        if(number <= 1)
	            return -1;
	 
	        int value=0;
	        int largestPrime=0;
	        boolean isPrime = true;
	        for(int i=1; i <=number;i++)
	        {
	            if(number%i==0)
	            {
	                value=i;
	            }
	                for(int j=2; j< value;j++)
	                {
	                    if(value%j==0)
	                    {
	                        isPrime=false;
	                        break;
	                    }
	                }
	            if(isPrime)
	                largestPrime= value;
	        }
	        return largestPrime;
	    }
}
