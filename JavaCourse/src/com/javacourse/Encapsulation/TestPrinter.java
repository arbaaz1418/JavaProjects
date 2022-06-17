package com.javacourse.Encapsulation;

public class TestPrinter {

	public static void main(String[] args) {

		Printer printer=new Printer("Canon", 60, false);
		System.out.println("Initial page count "+ printer.getPagesPrinted());
		
		int printPages=printer.printPages(4);
		System.out.println("Pages printed was "+printPages+"new total count for printer is "+printer.getPagesPrinted());
	}

}
