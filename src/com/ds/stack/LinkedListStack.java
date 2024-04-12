package com.ds.stack;

public class LinkedListStack {

	private Node head;

	class Node {
		Node next;
		int data;
	}

	LinkedListStack() {
		head = null;
	}

	public static void main(String[] args) {
		LinkedListStack lls = new LinkedListStack();
		lls.push(20);
		lls.push(50);
		lls.push(80);
		lls.push(40);
		lls.push(60);
		lls.push(75);
		
		printStack(lls.head);
		System.out.println("Element removed from LinkedList: "+lls.pop());
		System.out.println("Element removed from LinkedList: "+lls.pop());
		
		printStack(lls.head);
	}

	private int pop() {
		if(head==null) {
			System.out.println("Node empty");
			return -1;
		}
		int value=head.data;
		head=head.next;
		return value;
	}

	private static void printStack(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	private void push(int value) {
		Node oldHead = head;
		head = new Node();
		head.data = value;
		head.next = oldHead;
	}

}
