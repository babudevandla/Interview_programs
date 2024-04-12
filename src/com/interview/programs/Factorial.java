package com.interview.programs;

public class Factorial {

	public static void main(String[] args) {

		Integer n = 5;
		Integer fact = 1;
		for (int i = 1; i <= n; ++i) {
			fact = fact * i;
		}

		System.out.println("Factorial : " + fact);
	}

}
