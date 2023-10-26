package com.sunbeam;

public class NonRepeating {

	public static int findNonRepeating(int arr[]) {
		for (int i = 0; i < arr.length; i++) 
		{
			int count = 0;
			for (int j = 0; j < arr.length; j++) 
			{
				if (arr[i] == arr[j]) 
				{
					count++;
				}
			}
			if (count == 1)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int index = findNonRepeating(arr);
		System.out.println("First non repeating element : " + arr[index]);
	}

}
