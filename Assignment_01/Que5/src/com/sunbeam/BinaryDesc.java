package com.sunbeam;

public class BinaryDesc {

	public static int binaryDesc(int arr[], int key)
	{
		int left, right, mid;
		left = 0;
		right = arr.length-1;
		while(left<=right)
		{
			mid = (left+right)/2;
			if(arr[mid]==key)
				return mid;
			else if(key<arr[mid])
				left=mid+1;
			else
				right = mid-1;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {99,88,66,55,33,22,11};
		
		int index = binaryDesc(arr, 99);
		if(index!=-1)
			System.out.println("Element found at index : "+index);
		else
			System.out.println("Element not found.");
	}

}
