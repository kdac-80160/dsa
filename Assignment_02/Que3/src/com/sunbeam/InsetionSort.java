package com.sunbeam;

import java.util.Arrays;

public class InsetionSort {

	public static int insertionSort(int arr[])
	{
		int j, temp, count = 0;
		for(int i = 1; i<arr.length;i++)
		{
			j = i;
			temp = arr[j];
			count++;
			while(j>0 && arr[j-1]>temp) 
			{
				count++;
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int arr[] = {11,22,33,44,55,66,77};
		int comparions = insertionSort(arr);
		System.out.println("Before sort : "+Arrays.toString(arr));
		System.out.println("Number of comparisons : "+comparions);
		System.out.println("After sort : "+Arrays.toString(arr));
		System.out.println();
		int arr1[] = {12,9,13,45,22,33,78,39};
		System.out.println("Before sort : "+Arrays.toString(arr1));
		int comparions1 = insertionSort(arr1);
		System.out.println("Number of comparisons : "+comparions1);
		System.out.println("After sort : "+Arrays.toString(arr1));
	}

}
