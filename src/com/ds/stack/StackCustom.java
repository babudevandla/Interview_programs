package com.ds.stack;

public class StackCustom {

	int arr[];
	int size;
	int top;

	StackCustom(int size) {
		this.arr = new int[size];
		this.size = size;
		this.top = 0;
	}

	public static void main(String[] args) {

		StackCustom stack = new StackCustom(5);
		System.out.println("************************");
		stack.push(2);
		stack.push(10);
		stack.push(25);
		stack.push(11);
		stack.push(5);
		stack.push(30);
		System.out.println("************************");
		stack.peek();
		System.out.println("************************");
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
	}

	private int pop() {
		if (!isEmpty()) {
			int temp = top - 1;
			top--;
			System.out.println("Poped Value:" + arr[temp]);
			return arr[temp];
		} else {
			System.out.println("Stack is Empty!");
			return -1;
		}
	}

	public int peek() {
		if (!this.isEmpty()) {
			System.out.println("Peeked Value: "+arr[top-1]);
			return arr[top-1];
		}else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}

	private void push(int val) {
		if (!isFull()) {
			arr[top] = val;
			top++;
			System.out.println("Pushed value : " + val);
		} else {
			System.out.println("Stack is full!");
		}

	}

	private boolean isEmpty() {
		if (top == 0)
			return true;

		return false;
	}

	private boolean isFull() {
		if (size == top)
			return true;

		return false;
	}
}
