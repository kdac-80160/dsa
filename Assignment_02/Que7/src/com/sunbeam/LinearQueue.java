package com.sunbeam;

public class LinearQueue {
	private int front, rear;
	private int size;
	private int arr[];
	
	public LinearQueue(int size) {
		this.front = 0;
		this.rear = 0;
		this.size = size;
		this.arr = new int[size];
	}
	
	public void push(int data)
	{
		this.arr[rear] = data;
		rear++;
	}
	
	public void pop()
	{
		front++;
	}
	
	public boolean isEmpty()
	{
		return rear == front;
	}
	
	public boolean isFull()
	{
		return rear == this.size;
	}
	
	public int peek()
	{
		return arr[front];
	}
	
	
}
