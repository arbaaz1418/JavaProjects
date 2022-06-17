package com.javacourse.ExceptionHandling;

public class HandleExcepExampl {
	
	double divideByZero(int x, int y) {
		return x/y;
	}

	public static void main(String[] args) {

		HandleExcepExampl ex=new HandleExcepExampl();
		int a=10;
		int b=0;
		try {
			ex.divideByZero(a, b);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception occured");
			e.printStackTrace();	
		
		}
		
	}

}
