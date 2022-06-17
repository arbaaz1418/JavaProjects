package com.javacourse.Encapsulation;

public class Printer {

	private String name;
	private int tonerLevel=100;
	private int pagesPrinted;
	private boolean isDuplex;
	public Printer(String name, int tonerLevel, 
			boolean isDuplex) {
		super();
		this.name = name;
		if(tonerLevel>0 && tonerLevel <=100)
		{
			this.tonerLevel = tonerLevel;
		}
		else
		{
			this.tonerLevel=0;
		}
		this.isDuplex = isDuplex;
	}
	
	public void fillUpToner(int ink)
	{
		if(this.tonerLevel < 100)
		{
			this.tonerLevel=this.tonerLevel+ink;
		}
		
	}

	public int addToner(int tonerAmt)
	{
		if(tonerAmt > 0 && tonerAmt <=100)
		{
			if(this.tonerLevel + tonerAmt > 100)
			{
				return -1;
			}
			this.tonerLevel += tonerAmt;
			return this.tonerLevel;
		}
		else
		{
			return -1;
		}
	}
	public 	int  printPages(int pages)
	{
		int pagesToPrint = pages;
		if(this.isDuplex)
		{
			pagesToPrint =(pages/2)+(pages%2);
			System.out.println("Printing in Dulex Mode");
		}
		this.pagesPrinted +=pagesToPrint;
		return pagesToPrint;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	

	public int getPagesPrinted() {
		return pagesPrinted;
	}

	
	
	
}
