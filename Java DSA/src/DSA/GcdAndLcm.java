package DSA;

import java.util.Scanner;

public class GcdAndLcm {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
	      int num1 = scn.nextInt();
	      int num2 = scn.nextInt();
	      int temp1 = num1;
	      int temp2 = num2;
	      int gcd=0;
	      int n = 0;
	      
	      while(num1 % num2 != 0){
	          int remain = num1 % num2;
	          num1 = num2;
	          num2 = remain;
	      }
	      gcd = num2;
	      int lcm = (temp1 * temp2)/gcd;
	      System.out.println(gcd);
	      System.out.println(lcm);

	}

}
