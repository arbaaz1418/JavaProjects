package com.javacourse.Classes;

public class Person {

	private int age;
	private String firstName;
	private String lastName;
		
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0 || age > 100)
		{
			this.age=0;
		}
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isTeen()
	{
		if(age > 12 && age <20)
		{
			return true;
		}
		return false;
	}
	
	public String getFullName()
	{
		if(firstName.isEmpty() && lastName.isEmpty())
		{
			return " ";
		}
		else if(lastName.isEmpty())
		{
			return firstName;
		}
		else if(firstName.isEmpty())
		{
			return lastName;
		}
		else
		{
			return firstName+" "+lastName;
		}
	}
	public static void main(String[] args) {

		Person person=new Person();
		person.setFirstName("John");
		person.setLastName("Wick");
		person.setAge(10);
		
		System.out.println("Full name :"+person.getFullName());
		System.out.println("Is Teen :"+person.isTeen());
		
		person.setFirstName("Smith");
		person.setAge(18);
		
		System.out.println("Full name :"+person.getFullName());
		System.out.println("Is Teen :"+person.isTeen());
		
		person.setLastName("Sparrow");
		System.out.println("Full name :"+person.getFullName());
	}

}
