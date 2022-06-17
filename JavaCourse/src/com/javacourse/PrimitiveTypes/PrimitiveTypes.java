package com.javacourse.PrimitiveTypes;

public class PrimitiveTypes {

	public static void main(String[] args)
	{
		int myValue=10000;
		
		int minIntValue=Integer.MIN_VALUE;
		int maxIntValue=Integer.MAX_VALUE;
		
		System.out.println("Integer Minimum value "+minIntValue);
		System.out.println("Integer Maximum value"+maxIntValue);
		
		System.out.println("Busted Max = " +(maxIntValue +1));
		System.out.println("Busted min = " +(minIntValue -1));
		int maxValue=214_74_83_647;
		
		byte minByteValue=Byte.MIN_VALUE;
		byte maxByteValue=Byte.MAX_VALUE;
		
		System.out.println("Byteeger Minimum value "+minByteValue);
		System.out.println("Byteeger Maximum value"+maxByteValue);
		
		
		short minShortValue=Short.MIN_VALUE;
		short maxShortValue=Short.MAX_VALUE;
		
		System.out.println("Shorteger Minimum value "+minShortValue);
		System.out.println("Shorteger Maximum value"+maxShortValue);
		
		long minLongValue=Long.MIN_VALUE;
		long maxLongValue=Long.MAX_VALUE;
		
		System.out.println("Longeger Minimum value "+minLongValue);
		System.out.println("Longeger Maximum value"+maxLongValue);
		
		
		int myTotal = (minIntValue /2);
//		
//		byte myMinByte=(byte)(minByteValue/2);
//		byte myMaxByte=(byte)(maxByteValue/2);
		
		byte byteValue = 125;
		short shortValue = 22222;
		
		int intValue= 123456;
		long longValue = (50000) +(10*(byteValue+shortValue+intValue));
		
		System.out.println(longValue);
		
		
			
	}
}
