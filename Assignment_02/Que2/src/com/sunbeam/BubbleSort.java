package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {
	
	public static int bubbleSort(int arr[])
	{
		int count = 0, flag = 0;
		for(int i =1; i<arr.length; i++)
		{
			for(int j = 0; j<arr.length-i; j++)
			{
				count++;
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {1,22,11,4,55,66,21,24,88,45};
		System.out.println("Before sort : "+Arrays.toString(arr));
		int comparisons = bubbleSort(arr);
		System.out.println("After sort : "+Arrays.toString(arr));
		System.out.println("Number of comparisons done : "+comparisons);
		
		int arr1[] = {11,22,33,44,55,66,77,88};
		System.out.println("Before sort : "+Arrays.toString(arr1));
		int comparisons1 = bubbleSort(arr1);
		System.out.println("After sort : "+Arrays.toString(arr1));
		System.out.println("Number of comparisons done : "+comparisons1);
	}

}
