package com.interview.programs;

public class CountCharacters {

	public static void main(String[] args) {
		String input = "Today is Monday out";
		
		char[] ch=input.toCharArray();
		int charCount=0;
		for(char c:ch) {
			if(c=='o')
				charCount++;
		}
		System.out.println("o : "+charCount);

		charCount=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) =='a')
				charCount++;
		}
		
		System.out.println("a : "+charCount);
	}

}
