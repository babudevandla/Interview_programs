package com.interview.programs;

public class ReverseString1 {

	public static void main(String[] args) {
		
		String s="Hello";
		
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
	}

}
