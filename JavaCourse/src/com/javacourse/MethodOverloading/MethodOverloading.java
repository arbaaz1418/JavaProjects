package com.javacourse.MethodOverloading;

public class MethodOverloading {

	public static void main(String[] args) {

		
		calculateScore("Arbaz", 500);
		printName("Arbaz");
	}
	
	public static int calculateScore(String playerName,int score){
		System.out.println(playerName+" Scored "+score+" Points");
		return score*100;
	} 
	static void printName(String playerName){
		System.out.println(playerName);
	} 

}
