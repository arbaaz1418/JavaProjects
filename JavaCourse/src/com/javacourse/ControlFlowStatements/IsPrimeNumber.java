package com.javacourse.ControlFlowStatements;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(isPrime(i))
			{
				count++;
				System.out.println("Is "+i+" prime number ="+isPrime(i));
//				if(count == 3)
//				{
//					break;
//				}
			}
		}
		
		System.out.println("Total prime numbers in given range are "+count);
	}
	public static boolean isPrime(int n)
	{
		if(n==1)
		{
			return false;
		}
		for(int i=2;i<= n/2; i++)///i<=11 (23/20)  i=11
		{
			if(n%i==0)///(23/3=1) == 0
			{
				return false;
			}
		}
		return true;
	}
	
	

}
