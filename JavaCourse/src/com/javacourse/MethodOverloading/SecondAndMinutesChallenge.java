package com.javacourse.MethodOverloading;

public class SecondAndMinutesChallenge {

	public static final String INVALID_VALUE_MSG="Invalid Value";
	public static void main(String[] args) {
 
		System.out.println(getDurationString(3924));
	}
	
	public static String getDurationString(int minute, int seconds)
	{
		if((minute < 0) || (seconds <0 || seconds >=59))
		{
			return INVALID_VALUE_MSG;
		}
		
		int hours=(minute/60);
		int remainingMinutes=minute % 60;
		
		String hourString=hours + "h";
		if(hours <10)
		{
			hourString ="0"+ hourString;
		}
		String minString=minute + "h";
		if(minute <10)
		{
			minString ="0"+ minString;
		}
		String secString=seconds + "h";
		if(seconds <10)
		{
			secString ="0"+ secString;
		}
		return hourString+" "+minString+" "+secString;
	}
	public static String getDurationString(int seconds)
	{
		if(seconds <0)
		{
			return INVALID_VALUE_MSG;
		}
		int minutes= seconds / 60;
		int newSeconds=seconds % 60;
		return getDurationString(minutes,newSeconds);
	}

}
