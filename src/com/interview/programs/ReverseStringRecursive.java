package com.interview.programs;

import java.util.Scanner;

public class ReverseStringRecursive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String value: ");
		String s=sc.nextLine();
		System.out.println("Before Reverse: "+s);
		
		String rev=reverseStrRecursive(s);
		System.out.println("After Reverse : "+rev);
	}

	private static String reverseStrRecursive(String s) {
		if(s.isEmpty())
			return s;
		else {
			return reverseStrRecursive(s.substring(1))+s.charAt(0);
		}
		
	}

}
