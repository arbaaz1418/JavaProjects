package com.javacourse.ControlFlowStatements;

public class DiagonalStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printSquareStart(2);
	}
	public static void printSquareStart(int number)
	{
		if(number < 5)
		{
			System.out.println("Invalid Value");
		}
		else
		{
			for(int row=1; row<=number;row++)
			{
				for(int col=1;col<=number;col++)
				{
					if(row==1 || row == number|| col==1 || col==number || row==col||col==(number-row+1))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
				
					}
				}
				System.out.println();
			}
		}
	}

}
