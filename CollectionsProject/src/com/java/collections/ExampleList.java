package com.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExampleList {

	
//	public static void display(List<Element> value) {
//		for(Integer i:value) {
//			System.out.println(i);
//		}
//	}
	public static void display(List<Integer> value) {
		for(Integer i:value) {
			System.out.println(i);
		}
	}
	public static void add(List<Integer> value) {
		int element=10000000;
		for(int i=0;i < element;i++) {
			value.add(i);
		}
		display(value);
	}
	public static void main(String[] args) {

		List<Integer> elements=new ArrayList<>();
//		List<String> values=new ArrayList<>();
		List<Integer> values=new LinkedList<>();
		long startTime=System.currentTimeMillis();
		add(elements);
		long endTime=System.currentTimeMillis();
	//			System.out.println(end);
//		elements.add(100);
//		elements.add(55);
//		elements.add(33);
//		elements.add(67);
//		
////		values.add("Hello");
////		values.add("You");
////		values.add("there");
////		int size=elements.size();
////		System.out.println(elements.size());
//		
//		for(Integer i:elements) {
//			System.out.println(i);
//		}
////		for(String j:values) {
////			System.out.println(j);
////		}
//		
//		elements.remove(1);
//		for(Integer i:elements) {
//			System.out.println(i);
//		}
	}

}
