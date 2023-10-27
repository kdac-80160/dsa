package com.sunbeam;

import java.util.Arrays;

public class InsertionSortDesc {

	public static void insertionSortDesc(int arr[])
	{
		int j, temp;
		for(int i = 1; i<arr.length; i++)
		{
			j = i;
			temp = arr[j];
			while(j>0 && arr[j-1]<temp)
			{
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = {10,12,9,33,22,45,67,11};
		System.out.println("Before sorting : "+Arrays.toString(arr));
		insertionSortDesc(arr);
		System.out.println("After sorting : "+Arrays.toString(arr));
	}

}
