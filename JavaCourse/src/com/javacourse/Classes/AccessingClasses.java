package com.javacourse.Classes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

 class AccessingClasses {
	
	int age;
	static int month=12;

	public static void main(String[] args) {

		Student s1=new Student(10, "Arbaz");
		AccessingClasses a1=new AccessingClasses();
		int ag1=a1.age=10;
		int month1=a1.month=13;
		System.out.println(ag1+" "+month1);
		System.out.println();
		Class c1= s1.getClass();
		System.out.println(c1.getName());
		
		Method m1[]= c1.getDeclaredMethods();
		for(Method methods:m1) {
			System.out.println(methods.getName());
		}
		Field f1[]=c1.getDeclaredFields();
		for(Field fields:f1) {
			System.out.println(fields.getName());
		}
		
		
	}

}
