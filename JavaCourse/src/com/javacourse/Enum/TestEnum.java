package com.javacourse.Enum;

public class TestEnum {

	WeekDay day;
	
	public TestEnum(WeekDay day) {
//		super();
		this.day = day;
	}
	public void whatDayItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("FOund it is monday");
			break;
		case FRIDAY:
			System.out.println("Friday found");
			break;
		default :
			System.out.println("Not found ");
			break;
		}
	}
	public static void main(String[] args) {
		TestEnum te=new TestEnum(WeekDay.valueOf("MON"));
		te.whatDayItIs();
		
	}

}
