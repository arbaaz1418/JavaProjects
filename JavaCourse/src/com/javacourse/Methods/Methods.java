package com.javacourse.Methods;

public class Methods {

	public static void main(String[] args) {

		
		int highScore=calculateScore(false,10000,8,200);
		System.out.println("Your final score is "+highScore);
		calculateScore(true,800,5,100);
	}
	
//	public static void calculateScore(boolean gameOver,int score,int levelComplete,int bonus)
//	{
//		if(gameOver)
//		{
//			int finalScore=score+(levelComplete*bonus);
//			System.out.println("Your final score is "+finalScore);
//		}
//	}

	public static int calculateScore(boolean gameOver,int score,int levelComplete,int bonus)
	{
		if(gameOver)
		{
			int finalScore=score+(levelComplete*bonus);
			
			return finalScore;
		}
		return -1;
		
	}
}
