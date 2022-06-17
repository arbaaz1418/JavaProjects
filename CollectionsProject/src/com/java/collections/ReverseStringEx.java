package com.java.collections;

public class ReverseStringEx {
	
	
	static char[] loopReverseString(char str[]) {
		int len=str.length-1;
		char[] reverseStr= new char[str.length];
		for (int i=0; i<=len;i++) {
			reverseStr[i]=str[len-i];
		}
		return reverseStr;
	}
   
	public static void main(String[] args) {

		ReverseStringEx ex= new ReverseStringEx();
		String makeItRev="Hi My Name is Arbaz";
		char reverse[] = makeItRev.toCharArray();
		System.out.println(loopReverseString(reverse));
	}

}
