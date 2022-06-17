package com.javacourse.List;

import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> groceryList=new ArrayList<String>();
	
	public void addGrocery(String item)
	{
		groceryList.add(item);
	}
	public void printList()
	{
		System.out.println("You have "+groceryList.size()+" item in your grocery list");
		for(int i=0;i<groceryList.size();i++)
		{
			System.out.println((i+1)+". "+groceryList.get(i));
		}
	}
	public void modifiyGrocery(String currentItem,String newItem)
	{
		int position=findItem(currentItem);
		if(position>=0)
		{
			modifiyGrocery(position,newItem);
		}
	}
	private void modifiyGrocery(int position , String addItem)
	{
		groceryList.set(position, addItem);
		System.out.println("Grocery item "+(position+1)+" has been modified");
	}
	public void removeItem(String item)
	{
		int position=findItem(item);
		if(position>=0)
		{
			removeItem(position);
		}
	}
	private void removeItem(int position)
	{
		groceryList.remove(position);
	}
	private int findItem(String item)
	{
		return groceryList.indexOf(item);
	}
	}
