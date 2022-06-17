package com.javacourse.IfThenKeywords;

public class IfThenKeywords {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score=3000;
		int levelComplete = 5;
		int bonus = 100;
		
		if(score < 5000 && score >1000)
		{
			System.out.println("Your score is less than 5000");
		}
		else if(score <  1000)
		{
			System.out.println("Your score is less than 1000");
		}
		else
		{
			System.out.println("Got Here");
		}
		
		if(gameOver)
		{
			int finalScore=score+(levelComplete*bonus);
			System.out.println("Your final score is "+finalScore);
		}
		score=10000;
		levelComplete=8;
		bonus=200;
		
		if(gameOver)
		{
			int secFinalScore =score+(levelComplete*bonus);
			System.out.println("Your New Final Score is "+secFinalScore);
		}
		
	}
}
