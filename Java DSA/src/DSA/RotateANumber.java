package DSA;

import java.util.Scanner;

public class RotateANumber {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	     int n = scn.nextInt();
	     int k = scn.nextInt();
	     int rotatedNum = 0;
	     int temp = n;
	     int count=0;
	     while(temp != 0){
	         temp = temp/10;
	         count++;
	     }
	     k=k % count;
	     if(k < 0) {
	    	 k=k+count;
	     }
	     int power = (int)Math.pow(10,k);
	     int q = n % power;
	     n = n/power;
	     rotatedNum = n + q * (int)Math.pow(10,count-k);
	     System.out.println(rotatedNum);
			/*
			 * int div = 1; //initialize divisor = 1 int mult = 1; //initialize multiplier =
			 * 1
			 * 
			 * for (int i = 1; i <= nod; i++) { if (i <= k) //while the iterator is less
			 * than k { //we increase the value of divisor div *= 10; } else //or else we
			 * increase the value of multiplier { mult *= 10; } }
			 * 
			 * int quo = n / div; // extracting the quotient int rem = n % div; //
			 * extracting the remainder
			 * 
			 * int r = rem * mult + quo; //forming the rotated number System.out.println(r);
			 */
	}

}
