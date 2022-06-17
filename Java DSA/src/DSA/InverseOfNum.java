package DSA;

import java.util.Scanner;

public class InverseOfNum {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		  
		  int n = scn.nextInt();
		  int index = 1;
		  int inverted = 0;
		  while (n != 0){
		    int q = n%10;
		    n = n/10;
		    inverted += index * Math.pow(10,q-1);
		    index++;
		  }
		  System.out.println(inverted)   ;

	}

}
