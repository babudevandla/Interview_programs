package com.exceptions;

class Parent {
	void msg() {
		System.out.println("parent");
	}
}

class TestExceptionChild extends Parent {
	void msg() throws NullPointerException {
		System.out.println("TestExceptionChild");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}
