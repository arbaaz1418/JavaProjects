package com.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer,String>();
		Hashtable<Integer, String> mapa = new Hashtable<Integer,String>();
		Map<Integer, String> map1 = new LinkedHashMap<Integer,String>();
		SortedMap<Integer, String> map2 = new TreeMap<Integer,String>();
		map.put(1, "ABC");
		map.put(3, "ABC");
		map.put(2, "ABC");
		map.put(6, "ABC");
		System.out.println(Math.pow(5, 999));
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(112);
//		list.remove(1);
//		list.add(1, 23);

		System.out.println(map.get("ABC"));
		
		int arr[] = new int[5];
		arr[0]=1;
		int arr1[] = {1,2,3,4,5,6,7,8,92,3,4,5};
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
	}

}
