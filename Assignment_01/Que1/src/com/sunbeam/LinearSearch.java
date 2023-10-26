package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int arr[], int key)
	{
		int count = 0;
		for(int i = 0; i<arr.length; i++)
		{
			count++;
			if(arr[i]==key)
				 return count;
		}
		return -1;
			
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int key;
		int arr[] = {1,2,7,3,2,22,5,33,9};
		System.out.print("Enter the key : ");
		key = sc.nextInt();
		int count = linearSearch(arr, key);
		if(count!= -1)
			System.out.println("Element found and number of comparisons done : "+count);
		else
			System.out.println("Element not found and number of comparisons done : "+arr.length);
		sc.close();
	}

}
