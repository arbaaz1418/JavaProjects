package com.javacourse.ControlFlowStatements;

public class Switch {

	public static void main(String[] args) {

		int switchValue=3;
		switch(switchValue)
		{
		case 1:
			System.out.println("Value 1");
			break;
		case 2:
			System.out.println("Value 2");
			break;
		case 3:case 4:case 5:
			System.out.println("Value "+switchValue);
			break;
		default:
			System.out.println("None of the above");
		
		}
		
		char letter='A';
		switch(letter)
		{
		case 'A':case 'B':case 'C':case 'D':case 'E':
			System.out.println("These are found "+letter);
			break;
		default :
			System.out.println("Not Found");
		}
		
		String day="Monday";
		switch(day.toLowerCase())
		{
		case "Monday":
			System.out.println("Mon");
			break;
		case "Tuesday":
			System.out.println("Tue");
			break;
		default:
			System.out.println("Error");
		}
	}

}
