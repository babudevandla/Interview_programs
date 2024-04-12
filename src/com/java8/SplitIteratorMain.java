package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SplitIteratorMain {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Banana", "Orange");

		Spliterator<String> s = list.spliterator();
		Spliterator<String> s1 = s.trySplit();

		s.forEachRemaining(System.out::println);
		System.out.println("-- traversing the other half of the spliterator --- ");
		s1.forEachRemaining(System.out::println);

		System.out.println("----------------------------");
		
		List<String> list1 = Arrays.asList("Apple", "Banana", "Orange");
		 Spliterator<String> s2 = list1.spliterator();
		 s2.tryAdvance(System.out::println);
		 System.out.println(" --- bulk traversal");
		 s2.forEachRemaining(System.out::println);

		 System.out.println(" --- attempting tryAdvance again");
		 boolean b = s2.tryAdvance(System.out::println);
		 System.out.println("Element exists: "+b);
	}

}
