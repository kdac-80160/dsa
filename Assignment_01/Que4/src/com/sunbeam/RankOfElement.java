package com.sunbeam;

public class RankOfElement {

	public static int findRank(int arr[], int key)
	{
		int rank = 0;
		for(int i = 0; i<arr.length; i++)
				if(arr[i]<=key)
					rank++;
		
		return rank;
	}
	public static void main(String[] args) {
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		
		int rank = findRank(arr, 4);
		System.out.println("Rank of element : "+rank);

	}

}
