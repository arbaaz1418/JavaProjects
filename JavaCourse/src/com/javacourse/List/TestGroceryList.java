package com.javacourse.List;

import java.util.Scanner;

public class TestGroceryList {

	public static Scanner scan=new Scanner(System.in);
	public static GroceryList grosList=new GroceryList();
	
	public static void main(String[] args) {

		boolean quit=false;
		int choice=0;
		printInstructions();
		while(!quit)
		{
			System.out.println("Enter choice");
			choice=scan.nextInt();
			scan.nextLine();
			switch(choice)
			{
			case 0:
				printInstructions();
				break;
			case 1:
				grosList.printList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchAnItem();
				break;
			case 6:
				quit=true;
				break;
			}
		}
	}
	public static void printInstructions()
	{
		System.out.println("\nPress ");
		System.out.println("\t0 - To print choice options");
		System.out.println("\t1 - To print list of grocery items");
		System.out.println("\t2 - To add an item to list");
		System.out.println("\t3 - To modify an item to list");
		System.out.println("\t4 - To remove an item to list");
		System.out.println("\t5 - To search an item to list");
		System.out.println("\t0 - To Quit application");
	}
	public static void addItem()
	{
		System.out.print("Please enter grocery item");
		grosList.addGrocery(scan.nextLine());
		System.out.println("Item added...!!!");
	}
	public static void modifyItem()
	{
		System.out.print("Enter current item name:");
		String itemName=scan.nextLine();
		System.out.println("Enter replacement item:");
		String newItem= scan.nextLine();
		grosList.modifiyGrocery(itemName, newItem);
		System.out.println("Item replaced...!!!");
		
	}
	public static void removeItem()
	{
		System.out.print("Enter item number:");
		String itemName=scan.nextLine();
		grosList.removeItem(itemName);
		System.out.println("Item removed...!!!");
	}
	public static void searchAnItem()
	{
		System.out.println("Enter item name you want to search");
		String searchItem=scan.nextLine();
//		if(grosList.findItem(searchItem) != null)
		{
			System.out.println("Found item "+searchItem+" in grocery list");
		}
//		else
//		{
//			System.out.println(searchItem+"Not found in grocery list");
//		}
	}
}

