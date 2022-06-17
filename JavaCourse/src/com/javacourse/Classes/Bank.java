package com.javacourse.Classes;

public class Bank {

	private int accountNumber;
	private double balance;
	private String customerName;
	private String customerEmail;
	private long phoneNumber;
	
	public Bank() {
		this(123,200.0,"default name","default address",123);
		System.out.println("Empty cosntruvtor");
	}
	public Bank(int accountNumber,double balance,String customerName,String customerEmail,
			long phoneNumber){
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.customerName=customerName;
		this.customerEmail=customerEmail;
		this.phoneNumber=phoneNumber;
	}
	
	public Bank(String customerName, String customerEmail, long phoneNumber) {
		this(111,500.0,customerName,customerEmail,phoneNumber);
//		this.customerName = customerName;
//		this.customerEmail = customerEmail;
//		this.phoneNumber = phoneNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAccountNumber(int accountNumber){
		this.accountNumber=accountNumber;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public void depositFunds(double depositAmount)
	{
		balance +=depositAmount;
		System.out.println("Deposit of "+depositAmount+ " made. New balance is "+balance);
	}
	public void withdrawFunds(double withdrawAmount)
	{
		if(balance-withdrawAmount <0)
		{
			System.out.println("Only "+balance+" Available , Insufficient Funds");
		}
		else{
			balance -=withdrawAmount;
			System.out.println("Withdrawal of "+withdrawAmount+" proccessed. Remaiming balance is "+balance);
		}
	}
	public static void main(String[] args) {

		Bank sbi=new Bank(12345,0.0,"Arbaz","arbaz@gmail.com",90909090);
		
		sbi.depositFunds(10000);
		sbi.withdrawFunds(1000);
		
		sbi.depositFunds(1000);
		sbi.withdrawFunds(10000);
		
		
		
		
		
		
		
		
	}

}
