package com.collections;

public class CustomHashSetImpl {

	public static void main(String[] args) {
		CustomHashSet<String> set=new CustomHashSet<>();
		set.add("abc");
		set.add("b");
		set.add("a");
		System.err.println(set.toString());
		
	}

}
