package com.collections;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable1 {

	public static void main(String[] args) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");
		hm.put(103, "Babu");
		hm.put(104, null);

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("----------- Iteration 2 -----------");
		hm.entrySet().stream().forEach(System.out::println);

		System.out.println("---------------------");

		System.out.println(hm.getOrDefault(103, "Not Found"));
		System.out.println(hm.getOrDefault(105, "Not Found"));
	}

}
