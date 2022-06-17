package com.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DeQueueEx {

	public static void main(String[] args) {

		Deque<Integer> dq= new LinkedList<Integer>();
		dq.add(5);
		dq.addFirst(1);
		dq.addLast(10);
		dq.offer(3);
		dq.offerFirst(8);
		dq.offerLast(9);
		dq.push(6);
		dq.pop();
		Deque<Integer> aq= new ArrayDeque<Integer>();
	
		System.out.println(dq);
	}

}
