package com.javacourse.EncapsulationPractice;

public class TestPrinter {

	public static void main(String[] args) {

		Printer printer=new Printer(50, true);
		System.out.println(printer.fillUpToner(40));
		System.out.println("Initial page count :"+printer.getNoOfPagesPrinted());
		int pagesPrinted=printer.printPages(3);
		System.out.println("Pages printed was "+pagesPrinted+" new total print count for printer :"+printer.getNoOfPagesPrinted());
//		pagesPrinted=printer.printPages();
//		System.out.println("Pages printed was "+pagesPrinted+" new total print count for printer :"+printer.getNoOfPagesPrinted());
//		
//	}
	}
}
