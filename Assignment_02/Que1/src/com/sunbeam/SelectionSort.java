package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {

	public static int selectionSort(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				count++;
				if (arr[i] > arr[j]) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		int arr[] = {7,4,21,3,66,22,11,77,99,12,15};
		System.out.println("Before sorting : "+Arrays.toString(arr));
		int comparisons = selectionSort(arr);
		System.out.println("Number of comparisons done : "+comparisons);
		System.out.println("After sorting : "+Arrays.toString(arr));
	}

}
