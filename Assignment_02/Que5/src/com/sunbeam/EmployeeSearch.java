package com.sunbeam;

public class EmployeeSearch {

	public static void sortBySalary(Employee arr[], double salary) { //used insertion sort
		int j;
		Employee temp;
		for(int i = 1; i<arr.length;i++)
		{
			j = i;
			temp = arr[j];
			while(j>0 && arr[j-1].getSalary()>temp.getSalary()) 
			{				
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		Employee arr[] = new Employee[5];
		arr[0] = new Employee(1001, "Mahendra", 80000);
		arr[1] = new Employee(1002, "Aakash", 60000);
		arr[2] = new Employee(1003, "Vanshika", 50000);
		arr[3] = new Employee(1004, "Sarthak", 90000);
		arr[4] = new Employee(1005, "Deepanshu", 40000);
		System.out.println("Before sorting : ");
		for(Employee e : arr)
			System.out.println(e);
		sortBySalary(arr, 90000);
		System.out.println("After sorting : ");
		for(Employee e : arr)
			System.out.println(e);
	}

}
