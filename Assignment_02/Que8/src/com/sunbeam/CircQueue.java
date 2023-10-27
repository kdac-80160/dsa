package com.sunbeam;

public class CircQueue {
private int count, front, rear;
private int arr[];
private int size;

public CircQueue(int size) {
	this.front = -1;
	this.rear = -1;
	this.count = 0;
	this.arr = new int[size];
	this.size = size;
}

public void push(int element)
{	
	rear = (rear+1)%size;
	arr[rear] = element;
	this.count++;
}

public void pop()
{
	front = (front+1)%size;
	this.count--;
	if(front==rear & front!=-1)
		front=rear=-1;
}

public int peek()
{
	return arr[front+1];
}

public boolean isEmpty()
{
	return this.count == 0;
}

public boolean isFull()
{
	return this.count == this.size;
}
}
