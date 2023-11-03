package com.sunbeam;

public class Queue {
	private int front;
	private int rear;
	private int arr[];
	private int size;

	public Queue(int size) {
		this.size = size;
		this.front = -1;
		this.rear = -1;
		this.arr = new int[size];
	}
	
	public void push(int element)
	{
		this.rear = (this.rear+1)%size;
		this.arr[rear] = element;
	}
	
	public int pop()
	{
		this.front = (this.front+1)%size;
		int popped = arr[this.front];
		if(front == rear && front!=-1)
		{
			this.front = -1;
			this.rear = -1;
		}
		return popped;
	}
	
	public int peek()
	{
		return this.arr[front+1];
	}
	
	public boolean isEmpty()
	{
		return this.rear == this.front;
	}
	
	public boolean isFull()
	{
		return this.rear == this.size-1 && front==-1;
	}
}
