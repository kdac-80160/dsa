package com.sunbeam;

public class Stack {
	private int top;
	private final int size;
	private int max;
	private int stack[];

	public Stack(int size) {
		this.size = size;
		this.stack = new int[size];
		this.top = 0;
		this.max = Integer.MIN_VALUE;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public boolean isFull() {
		return this.top == size;
	}

	public void push(int element) {
		stack[top++] = element;
		if(element>max)
		{
			this.max = element;
		}
	}

	public int pop() {
		return stack[--top];
	}
	
	public int peek()
	{
		return stack[top-1];
	}
	
	public int getMax()
	{
		return this.max;
	}
}
