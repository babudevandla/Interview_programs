package com.exceptions;

public class Parent1 {
	void msg() throws Exception {
		System.out.println("parent");
	}
}

 class TestExceptionChild2 extends Parent1 {
	void msg()  {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent1 p = new Parent1();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
