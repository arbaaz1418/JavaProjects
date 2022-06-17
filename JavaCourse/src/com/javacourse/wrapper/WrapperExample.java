package com.javacourse.wrapper;

public class WrapperExample {

	public static void main(String[] args) {

		
		Float fl=Float.valueOf(0.15f);
//		System.out.println(f1);
		
		Integer i1=Integer.valueOf((int) 11.15f);
		System.out.println(i1);
		int floatToInt=fl.intValue();
		System.out.println(floatToInt);
		Integer hundred=Integer.valueOf("100",2);
		System.out.println(hundred);
	}

}
