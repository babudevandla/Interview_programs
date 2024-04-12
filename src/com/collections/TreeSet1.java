package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {

		//Set<String> set = new TreeSet<String>();
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.add("Ravi");
		al.add("R");
		//al.add(null);
		// Traversing elements
		 //Iterator itr=al.descendingIterator();  
		System.out.println("Highest Value: "+al.pollFirst());  
        System.out.println("Lowest Value: "+al.pollLast());  
		Iterator itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
