package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int size, choice;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		size = sc.nextInt();
		DescStack stack = new DescStack(size);

		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				break;
			case 1:
				if (stack.isFull())
					System.out.println("Stack is full.");
				else {
					int element;
					System.out.print("Enter element : ");
					element = sc.nextInt();
					stack.push(element);
				}
				break;
			case 2:
				if (stack.isEmpty())
					System.out.println("Stack is empty.");
				else
					System.out.println("Popped : " + stack.pop());
				break;
			case 3:
				if (stack.isEmpty())
					System.out.println("Stack is empty.");
				else
					System.out.println("Peek : " + stack.peek());
				break;
			default:
				System.out.println("Enter a valid choice.");
			}
		} while (choice != 0);
		System.out.println("Thank you for using the application.");
		sc.close();
	}

}
