package com.javacourse.ControlFlowStatements;

public class SharedDigit {

	public static void main(String[] args) {

		System.out.println(hasSharedDigit(12, 32));
		
	}
	
	public static boolean hasSharedDigit(int firstValue, int secValue)
	{
		if((firstValue <= 10 || firstValue >= 99) && (secValue <= 10 || secValue >= 99))
		{
			return false;
		}
		int lastDigit1=0;
		int lastDigit2=0;
		int tempNumber=firstValue;
		while(firstValue != 0)
		{
			lastDigit1 = firstValue % 10;
			tempNumber = firstValue;
			while(tempNumber != 0)
			{
				lastDigit2 = secValue % 10;
				if(lastDigit1 == lastDigit2)
					return true;
				tempNumber /= 10;
			}
			firstValue /= 10;
		}
		return false;
	}
}
//		int fV1,fV2,sV1,sV2;
//	
//		fV1=firstValue % 10;
//		fV2=firstValue / 10;
//	
//		sV1=secValue % 10;
//		sV2=secValue / 10;
//		
//		if((fV1 == sV1) || (fV1 == sV2) || (fV2 == sV1) || (fV2 == sV2))
//		{
//			return true;
//		}
//		else{
//			return false;
//		}

