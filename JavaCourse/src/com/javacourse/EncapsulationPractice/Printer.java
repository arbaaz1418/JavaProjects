package com.javacourse.EncapsulationPractice;

public class Printer {

	private int tonerLevel;
	private int noOfPagesPrinted=0;
	private boolean isDuplex;
	public Printer(int tonerLevel, boolean isDuplex) {
		super();
		if(tonerLevel > 0 && tonerLevel <=100)
		{
			this.tonerLevel = tonerLevel;	
		}
		this.isDuplex = isDuplex;
	}
	
	public int fillUpToner(int tonerAmt)
	{
		if(tonerAmt > 0 && tonerAmt <=100)
		{
			if((tonerLevel+tonerAmt)>100)
			{
				return -1;
			}
			else
			{
				tonerLevel += tonerAmt;
			}
		}
		else
		{
			return -1;
		}
		return tonerLevel;
		
	}
	public int printPages(int pages)
	{
		int pagesToPrint=pages;
		if(this.isDuplex==true)
		{
			pagesToPrint /= 2;
			this.noOfPagesPrinted +=pagesToPrint;
		}
		return pagesToPrint;
		
	}

	public int getNoOfPagesPrinted() {
		return noOfPagesPrinted;
	}
	
	
}
