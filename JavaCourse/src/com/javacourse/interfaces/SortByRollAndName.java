package com.javacourse.interfaces;

import java.util.Comparator;

public class SortByRollAndName implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		int nameCompare= s1.getName().compareTo(s2.getName());
		int rollCompare= s1.getRollNo() - s2.getRollNo();
		return (nameCompare==0)?rollCompare:nameCompare;
	}
	

}
