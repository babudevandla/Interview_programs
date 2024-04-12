package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {

		Deque<String> que=new ArrayDeque<>();
		que.add("Babu");
		que.offer("Sayed");
		que.add("Ravi");
		que.add("Ajay");
	//	que.add(null);
		que.addFirst("Simha");
		que.stream().forEach(System.out::println);
		System.out.println("##########################");
		que.pollFirst();
		que.pollLast();
		que.addFirst("Ramu");
		que.addLast("Bhanu");
		que.stream().forEach(System.out::println);
	}

}
