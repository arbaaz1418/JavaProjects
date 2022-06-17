package com.javacourse.Operators;

public class Operators {

	public static void main(String[] args) {

		int result=1+2;
		
		result += 2;
		System.out.println(result);
		
		result *= 10;
		System.out.println(result);
		
		result /=2;
		System.out.println(result);
		
		result %= 2;
		System.out.println(result);
		
		boolean isAlien=false;
		
		if(isAlien==true);
			System.out.println("Is Not Alien");
			
		int topScore=100;
		if(topScore != 100)
		{
			System.out.println("You got top score");
		}
		int secScore=60;
		if(secScore<topScore && topScore<100)
		{
			System.out.println();
		}
		
		boolean isCar=false;
		if(isCar == false){
			System.out.println("Not  a car");
			
		}
//		if(!isCar)
//		{
//			
//		}
		boolean warCar=isCar ? true:false;
		System.out.println(warCar);
		
		int john=18;
		
		boolean isAdult= (john==18)? true:false;
		System.out.println("John is "+isAdult);
		
		
		
		
		
		
		
		
		
		
	}

}
