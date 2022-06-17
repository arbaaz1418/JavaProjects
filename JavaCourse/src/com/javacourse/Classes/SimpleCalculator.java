package com.javacourse.Classes;


public class SimpleCalculator {
	private double firstNumber;
	private double secondNumber;
	
	public void setFirstNumber(double firstNumber){
		this.firstNumber=firstNumber;
	}
	public double getFirstNumber(){
		return firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public double getAdditionResult()
	{
		return firstNumber+secondNumber;
	}
	public double getSubtractionResult()
	{
		return firstNumber-secondNumber;
	}
	public double getMultiplicationResult()
	{
		return firstNumber* secondNumber;
	}
	public double getDivisionResult()
	{
		if(secondNumber == 0)
		{
			return 0;
		}
		return firstNumber/secondNumber;
	}
	
	public static void main(String[] args)
	{
		SimpleCalculator cal=new SimpleCalculator();
		cal.setFirstNumber(5.0);
		cal.setSecondNumber(0);
		
		System.out.println("Sum :"+cal.getAdditionResult());
		System.out.println("Sub :"+cal.getSubtractionResult());
		System.out.println("Mul :"+cal.getMultiplicationResult());
		System.out.println("Divi :"+cal.getDivisionResult());
		
		
		
		
		
		
		
		
		
		
	}
	
}
