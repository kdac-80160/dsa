package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int arr[], int key) {
		int left, right, mid;
		int count = 0;
		left = 0;
		right = arr.length - 1;
		while (left <= right) {
			mid = (left + right) / 2;
			count++;
			if (arr[mid] == key)
				return count;
			else if (arr[mid] > key)
				right = mid - 1;
			else
				left = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {11,22,33,44,55,88,99};
		Scanner sc = new Scanner(System.in);
		int key;
		System.out.print("Enter the key : ");
		key = sc.nextInt();
		int count = binarySearch(arr, key);
		if(count !=-1)
			System.out.print("Element found and total comparisons done : "+count);
		else
			System.out.println("Element not found.");
		sc.close();
		
	}
}
