package com.javacourse.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Student> student= new ArrayList<Student>();
		student.add(new Student(111, "John",25));
		student.add(new Student(107, "Harry",25));
		student.add(new Student(105, "Harry",25));
		student.add(new Student(114, "Kevin",25));
		
		System.out.println("Unsorted Student list :\n");
		for(Student s:student) {
			System.out.println(s);
		}
		
		Collections.sort(student, new SortByRollAndName());
		System.out.println("\nSorted Student list by Roll Number:\n");
		for(Student s:student) {
			System.out.println(s);
		}
		
//		Collections.sort(student, new SortByName());
//		System.out.println("\nSorted Student list by Name:\n");
//		for(Student s:student) {
//			System.out.println(s);
//		}
	}

}
