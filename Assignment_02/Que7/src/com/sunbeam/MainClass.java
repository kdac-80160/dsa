package com.sunbeam;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		LinearQueue queue = new LinearQueue(4);
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("------------------");
			System.out.println("0 : Exit\n1 : Add\n2 : Remove\n3 : Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println("------------------");

			switch (choice) {
			case 0:
				break;
			case 1:
				if (queue.isFull())
					System.out.println("Queue is full");
				else
				{
					int element;
					System.out.print("Enter the element : ");
					element = sc.nextInt();
					queue.push(element);
					System.out.println("Added.");
				}
				break;
			case 2 : 
				if(queue.isEmpty())
					System.out.println("Queue is empty.");
				else
				{
					queue.pop();
					System.out.println("Removed.");
				}
				break;
			case 3 :
				if(queue.isEmpty())
					System.out.println("Queue is empty.");
				else
				{
					System.out.println(queue.peek());
				}
				break;
				default : System.out.println("Wrong choice entered..");
			}
		} while (choice != 0);

	}

}
