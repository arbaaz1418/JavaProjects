package com.javacourse.Classes;

public class TestingScope
{
	public static void main(String args[])
    {
  
        int x = 21, sum = 0;
  
        do {
  
            // The line will be printed even
            // if the condition is false
            sum += x;
            x--;
            System.out.println(x);
  
        } while (x > 10);
        System.out.println("Summation: " + sum);
    }
}
