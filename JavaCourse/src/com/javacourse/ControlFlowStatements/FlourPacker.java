package com.javacourse.ControlFlowStatements;

public class FlourPacker {

	public static void main(String[] args) {

		System.out.println(canPack(2,1,5));
	}
	
	public static boolean canPack(int bigCount,int smallCount,int goal)
	{
		if((bigCount < 0) || (smallCount < 0) || (goal < 0))
		{
			return false;
		}
		int sum=0;
		int bigCountSum=0;
		int smallCountSum=0;
		bigCountSum=bigCount * 5;
		smallCountSum = smallCount * 1;
		sum=(bigCountSum + smallCountSum);
		if(sum == goal)
		{
			return true;
		}
		else if(sum >= goal)
		{
			if(bigCountSum >= goal)
			{
				return false;
			}
			return true;
		}
		return false;
	}

}
