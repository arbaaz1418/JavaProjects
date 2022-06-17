package com.javacourse.Classes;

public class VipCustomer {

	String name;
	int creditLimit;
	String email;
	public VipCustomer()
	{
		this("DefualtName",5000,"DefaultAddress");
		System.out.println("defaultcons");
	}
	public VipCustomer(String name,String email)
	{
		this(name,1000,email);
	}
	
	public VipCustomer(String name, int creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
		public String getName() {
		return name;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}
	public static void main(String[] args) {

		VipCustomer vip=new VipCustomer();
		System.out.println(vip.getName());
		
		VipCustomer vip1=new VipCustomer("Arbaz","Arbaz@gmail.com");
		System.out.println(vip1.getName());
		
		VipCustomer vip2=new VipCustomer("John",1000,"adsdasda@");
		System.out.println(vip2.getName());
	}

}
