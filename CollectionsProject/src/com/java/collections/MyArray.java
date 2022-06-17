package com.java.collections;

import java.util.Arrays;

public class MyArray {

	private int length;
	private Object[] arrayList; 
	
	public MyArray(int n) {
		if(n <= 0) {
			System.out.println("N value should be greater than 0");
		}
		this.arrayList= new Object[n];
		this.length=0;
	}
	public MyArray() {
		this(10);
	}
	
	Object get(int index) {
		return this.arrayList[index];
	}
	void add(int value) {
		this.arrayList[this.length]=value;
		length++;
	}
	void delete(int index) {
		this.arrayList[index]=null;
		this.length--;
	}
	
	@Override
	public String toString() {
		return "MyArray [length=" + length + ", arrayList=" + Arrays.toString(arrayList) + "]";
	}
	public static void main(String[] args) {

		MyArray arr= new MyArray();
		arr.add(12);
		arr.add(34);
		System.out.println(arr);
		System.out.println(arr.get(1));
		arr.delete(0);
		System.out.println(arr);
		
	}

}
