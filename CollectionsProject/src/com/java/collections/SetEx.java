package com.java.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {

		Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7}));
		
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {8,2,0,4}));
		
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		
		System.out.println("Union : "+union);
		
		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		
		System.out.println("Union : "+intersection);
		
		Set<Integer> diff = new HashSet<Integer>(a);
		diff.removeAll(b);
		
		System.out.println("Union : "+diff);
	}

}
