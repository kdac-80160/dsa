package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack(5);
		int element;
		for(int i = 1; i<=5; i++) {
			System.out.print("Enter "+i+" Element : ");
			element = sc.nextInt();
			stack.push(element);
		}
		System.out.println("Max : "+stack.getMax());

	}

}
