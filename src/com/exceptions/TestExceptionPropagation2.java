package com.exceptions;

import java.util.Scanner;

public class TestExceptionPropagation2 {

	void m() {
		//throw new java.io.IOException("device error");// checked exception
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation2 obj = new TestExceptionPropagation2();
		obj.p();
		System.out.println("normal flow");
		Scanner sc=new Scanner(System.in);
		String s="";
		s+=sc.nextLine();
		
		System.out.println(s);
	}

}
