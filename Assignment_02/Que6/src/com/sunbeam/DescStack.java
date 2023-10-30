package com.sunbeam;

public class DescStack {
	private int top;
	private int size;
	private int arr[];

	public DescStack(int size) {
		this.size = size;
		arr = new int[size];
		this.top = size;
	}

	public void push(int element) {
		arr[top - 1] = element;
		top--;
	}

	public int pop() {
		return arr[top++];
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == size;
	}

	public boolean isFull() {
		return top == 0;
	}
}
