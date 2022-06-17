package com.javacourse.Composition;

public class TestPC {

	public static void main(String[] args) {

		Dimentions dimentions=new Dimentions(10,12,5);
		Case theCase= new Case("1418A","Apple","240W",dimentions);
		
		Monitor monitor=new Monitor("NITRO7", "ACER", 15, new Resolution(240, 140));
		
		Motherboard motherBoard=new Motherboard("VENGENCE", "CORSAIR", 4, 6, "2.44v");
		
		PC pc=new PC(theCase,monitor,motherBoard);
		/*pc.getMonitor().drawPixelAt(10, 20, "BLUE");
		pc.getMotherboard().loadProgram("WINDOWS 10");
		pc.getTheCase().pressPowerButton();*/
		
		pc.powerUp();
		
		
		
		
	}

}
