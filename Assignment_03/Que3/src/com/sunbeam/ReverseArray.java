package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Stack stack = new Stack(5);
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print("Enter "+(i+1)+" Element : ");
			arr[i] = sc.nextInt();
			stack.push(arr[i]);
		}
		System.out.println("Before reverse : "+Arrays.toString(arr));
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = stack.pop();
		}
		System.out.println("After reverse : "+Arrays.toString(arr));
	}

}
