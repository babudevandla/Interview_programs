package com.interview.programs;

public class ReverseInteger {

	public static void main(String[] args) {

		int num = 1234, rev = 0;
		System.out.println("Original Value: " + num);
		while (num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}

		System.out.println("Reverse Value: " + rev);
	}

}
