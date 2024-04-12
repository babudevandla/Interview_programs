package com.interview.programs;

import java.util.StringTokenizer;

public class FindStringCount {

	public static void main(String[] args) {

		String s = "ABABCDEDEFCDBCSDEFBABABCAB";

		String delims = "AB ";

		StringTokenizer st = new StringTokenizer(s, delims);
		System.out.println("No of Token = " + st.countTokens());
		
	}

	
}
