package DSA;

import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		  int a = scn.nextInt();//5
		  int b = scn.nextInt();//3
		  int c = scn.nextInt();//4
		  int large=a;
		  if(b > c) {
			  large = b;
		  }
		  if(c > a){
			  large = c;
		  }
		  
		  if(large == a) {
			  System.out.println((b*b + c*c) == a*a);
		  }else if(large == b) {
			  System.out.println((a*a + c*c) == b*b);
		  }else {
			  System.out.println((a*a + b*b) == c*c);
		  }
		  

	}

}
