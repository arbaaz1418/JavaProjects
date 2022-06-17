package com.javacourse.OopChallenge;

public class Hamburger {

	private String breadRollType;
	private String meat;
	private int basePrice=0;
	private String name;
	private int extraAdded;
	private Extras extra1=null;
	private Extras extra2=null;
	private Extras extra3=null;
	private int grandTotal=0;
	
	public Hamburger(String breadRollType, String meat) {
		super();
		if((breadRollType.equals("Onion Roll") || (breadRollType.equals("Potato Roll") || (breadRollType.equals("Brown Bread Roll")))))
		{
			this.breadRollType = breadRollType;
		}
		if((meat.equals("Beef") || (meat.equals("Chicken"))))
		{
			this.meat = meat;
		}
		getBaseHamburgerPrice();
		this.grandTotal=this.basePrice;;
	}
	public void getBaseHamburgerPrice()
	{
		if((this.breadRollType.equals("Onion Roll") && (this.meat.equals("Beef"))))
		{
			this.basePrice=70;
		}
		else if((this.breadRollType.equals("Onion Roll") && (this.meat.equals("Chicken"))))
		{
			this.basePrice=60;
		}
		else if((this.breadRollType.equals("Potato Roll") && (this.meat.equals("Beef"))))
		{
			this.basePrice=50;
		}
		else if((this.breadRollType.equals("Potato Roll") && (this.meat.equals("Chicken"))))
		{
			this.basePrice=40;
		}
		else if((this.breadRollType.equals("Brown Bread Roll") && (this.meat.equals("Beef"))))
		{
			this.basePrice=80;
		}
		else if((this.breadRollType.equals("Brown Bread Roll") && (this.meat.equals("Chicken"))))
		{
			this.basePrice=75;
		}
		else
		{
			System.out.println("Hamburger Not Available...!!!");
		}
	}
	public void addExtras(String extra)
	{
		switch(extra)
		{
		case "Lettuce":
			addExtras(extraAdded,new Lettuce());
			extraAdded++;
			break;
		case "Tomato":
			addExtras(extraAdded,new Tomato());
			extraAdded++;
			break;
		case "Carrot":
			addExtras(extraAdded,new Carrot());
			extraAdded++;
			break;	
		default:
			break;
		}
	}
	public void addExtras(int extraAdded,Extras extras)
	{
		switch(extraAdded)
		{
		case 0:
			extra1=extras;
			this.grandTotal +=extra1.getPrice();
			break;
		case 1:
			extra2=extras;
			this.grandTotal += extra2.getPrice();
			break;
		case 2:
			extra3=extras;
			this.grandTotal += extra3.getPrice();
			break;
		default:
			break;
		}
	}
	
	public void printReceipt()
	{
		switch(getExtraAdded())
		{
		case 0:
			System.out.println("You have selected "+this.getBreadRollType()+" with "+this.getMeat()+" . ");
			break;
		case 1:
			System.out.println("You have selected "+this.getBreadRollType()+" with "+this.getMeat()+" and Extras are "+
					this.getExtra1()+".");
			break;
		case 2:
			System.out.println("You have selected "+this.getBreadRollType()+" with "+this.getMeat()+" and Extras are "+
					this.getExtra1()+" "+this.getExtra2()+".");
			break;
		case 3:
			System.out.println("You have selected "+this.getBreadRollType()+" with "+this.getMeat()+" and Extras are "+
					this.getExtra1()+" "+this.getExtra2()+" "+this.getExtra3()+".");
			break;
		default :
			break;
		
		}
		System.out.println("Your Grand total is "+this.getGrandTotal());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreadRollType() {
		return breadRollType;
	}
	public String getMeat() {
		return meat;
	}
	public int getBasePrice() {
		return basePrice;
	}
	public int getExtraAdded() {
		return extraAdded;
	}
	public Extras getExtra1() {
		return extra1;
	}
	public Extras getExtra2() {
		return extra2;
	}
	public Extras getExtra3() {
		return extra3;
	}
	public int getGrandTotal() {
		return grandTotal;
	}
	

	
	
}
