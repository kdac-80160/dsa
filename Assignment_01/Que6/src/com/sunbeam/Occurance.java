package com.sunbeam;

public class Occurance {

	public static int nthOccurance(int arr[], int key, int occurance)
	{
		int count = 0;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]==key)
				count++;
			if(count == occurance) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,6,3,1,6,1,5,9,4,1,7,9};
		int index = nthOccurance(arr, 1, 4);
		if(index!=-1)
		System.out.println("Occurance found at index : "+index);
		else
			System.out.println("Occurance not found.");
	}

}
