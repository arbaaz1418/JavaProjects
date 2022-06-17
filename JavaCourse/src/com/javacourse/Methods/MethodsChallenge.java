package com.javacourse.Methods;

public class MethodsChallenge {

	public static void main(String[] args) {

		
		int position=calculateHighScorePosition(1000);
		displayHighScorePosition("Arbaz", position);
		
		position=calculateHighScorePosition(500);
		displayHighScorePosition("SAM", position);
		
		position=calculateHighScorePosition(100);
		displayHighScorePosition("JOHN", position);
		
		position=calculateHighScorePosition(50);
		displayHighScorePosition("SMITH", position);
	}
	
	public static void displayHighScorePosition(String playerName , int position )
	{
		System.out.println(playerName+" managed to get into position "+position+" On the high score table");
	}
	
	public static int calculateHighScorePosition(int playerScore)
	{
		if(playerScore >= 1000)
		{
			return 1;
		}
		else if(playerScore >=500)
		{
			return 2;
		}
		else if(playerScore >=100)
		{
			return 3;
		}
		else
		{
			return 4;
		}
	}

}
