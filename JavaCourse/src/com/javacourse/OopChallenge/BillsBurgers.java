package com.javacourse.OopChallenge;

public class BillsBurgers {

	public static void main(String[] args) {

//		Hamburger burger=new Hamburger("Onion Roll", "Beef");
//		burger.addExtras("Lettuce");
//		burger.addExtras("Lettuce");
//		burger.addExtras("Carrot");
//		burger.printReceipt();
		
		HealthyBurger healthyBurger=new HealthyBurger("Brown Bread Roll", "Chicken");
		healthyBurger.addExtras("Salad");
		healthyBurger.addExtras("Lettuce");
		healthyBurger.addExtras("Tomato");
		healthyBurger.addExtras("Carrot");
		healthyBurger.addExtras("Broccili");
		
		healthyBurger.printReceipt();
		
		
	}

}
