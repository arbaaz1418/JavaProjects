package com.javacourse.OopChallenge;

public class HealthyBurger extends Hamburger {

	private Extras extra4=null;
	private Extras extra5=null;
	private int healthyExtraAdded;
	int addToGrandTotal=0;
	public HealthyBurger(String breadRollType, String meat) {
		super(breadRollType, meat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void addExtras(String extra) {
		super.addExtras(extra);
		switch(extra)
		{
		case "Salad":
			addExtras(healthyExtraAdded,new Salad());
			healthyExtraAdded++;
			break;
		case "Broccili":
			addExtras(healthyExtraAdded,new Broccili());
			healthyExtraAdded++;
			break;
		default:
			break;
		
		}
	}
	@Override
	public void addExtras(int extraAdded, Extras extras) {
		super.addExtras(super.getExtraAdded(), extras);
		switch(healthyExtraAdded)
		{
		case 0:
			extra4=extras;
			this.addToGrandTotal +=extra4.getPrice();
			break;
		case 1:
			extra5=extras;
			this.addToGrandTotal +=extra5.getPrice();
			break;
		default:
			break;
		}
	}
	@Override
	public void printReceipt() {
		super.printReceipt();
		switch(healthyExtraAdded)
		{
		case 0:
			System.out.println("You have selected "+this.getBreadRollType()+" with "+this.getMeat()+".");
			break;
		case 1:
			System.out.println("You have selected "+this.getBreadRollType()+" with "+this.getMeat()+" and Extras are "+
					this.getExtra4()+".");
			break;
		case 2:
			System.out.println("You have selected "+this.getBreadRollType()+" with "+this.getMeat()+" and Extras are "+
					this.getExtra4()+" "+this.getExtra5()+".");
			break;
		default :
			break;
		
		}
		System.out.println("Your Grand total is "+(super.getGrandTotal()+this.getAddToGrandTotal()));
	}
	
	public int getHealthyExtraAdded() {
		return healthyExtraAdded;
	}
	public int getAddToGrandTotal() {
		return addToGrandTotal;
	}
	public Extras getExtra4() {
		return extra4;
	}
	public Extras getExtra5() {
		return extra5;
	}

	
}
