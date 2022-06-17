package com.java.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();
		
		  q.add(5); q.add(1); q.add(6); q.add(2); q.add(8); q.add(3);
		  
		  System.out.println(q); 
		  q.element(); 
		  q.remove(); 
		  System.out.println(q);
		  
		 q.poll();
System.out.println(q);
		 
		 System.out.println(q.element());
		 System.out.println(q.peek()); 
		 q.offer(1);
		 System.out.println(q);
		 

		Queue<Integer> qq = new PriorityQueue<Integer>();
		qq.add(5);
		qq.add(1);
		qq.add(6);
		qq.add(2);
		qq.add(8);
		qq.add(3);
		qq.add(0);
		qq.offer(1);
		System.out.println(qq);

	}

}
