package com.ds;

public class SingleLinkedlist {
	Node head;

	class Node {
		Node next;
		int data;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		SingleLinkedlist list=new SingleLinkedlist();
		
		list.insertBackward(3);
		list.insertBackward(2);
		list.insertBackward(1);
		list.insertForward(4);
		list.printList();
	}

	private void printList() {
		Node last=head;
		while(last!=null) {
			System.out.print(last.data+" <-- ");
			last=last.next;
		}
		
	}

	private void insertBackward(int new_data) {
		Node new_node=new Node(new_data);
		
		new_node.next=head;
		head=new_node;
	}
	
	private void insertForward(int new_data) {
		
		Node new_node=new Node(new_data);
		if(head==null) {
			new_node=head;
			new_node.next=null;
		}else {
			Node last=head;
			while(last!=null) {
		       last = last.next; 
			}
			
			last.next = new_node; 
		}
		
	}

}
