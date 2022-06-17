package com.javacourse.CodingExcercise;

public class TeenNumberChecker {

	public static void main(String[] args) {

		System.out.println(hasTeen(99, 99, 99));
	}
	public static boolean hasTeen(int teenOne, int teenTwo,int teenThree)
	{
		return (isTeen(teenOne) || isTeen(teenTwo) || isTeen(teenThree))?true:false;
	}

	public static boolean isTeen(int teen)
	{
		return (teen >= 13 && teen <= 19)?true:false;
	}
}
