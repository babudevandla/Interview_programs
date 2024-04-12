package com.interview.programs;

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		
		char[] c=str.toCharArray();
		int count=0;
		for(char ch:c) {
			switch (ch) {
				case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	            	count++;
				
				break;

			default:
				break;
			}
		}
		
        System.out.println("Number of vowels in String [" + str + "] is : " + count);

	}

}
