package com.sunbeam;

public class EmployeeSearch {

	public static int searchByName(Employee arr[], String name) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getName().equals(name))
				return i;
		}

		return -1;
	}

	public static int searchById(Employee arr[], int id) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getEmpid() == id)
				return i;
		}

		return -1;
	}

	public static int searchBySalary(Employee arr[], double salary) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getSalary() == salary)
				return i;
		}

		return -1;
	}

	public static void main(String[] args) {
		Employee arr[] = new Employee[5];
		arr[0] = new Employee(1001, "Mahendra", 80000);
		arr[1] = new Employee(1002, "Aakash", 60000);
		arr[2] = new Employee(1003, "Vanshika", 50000);
		arr[3] = new Employee(1004, "Sarthak", 90000);
		arr[4] = new Employee(1005, "Deepanshu", 40000);
		int index = searchByName(arr, "Mahendra");
		if (index != -1)
			System.out.println("Employee found : " + arr[index]);
		else
			System.out.println("Employee not found.");
		
		index = searchById(arr, 1009);
		if (index != -1)
			System.out.println("Employee found : " + arr[index]);
		else
			System.out.println("Employee not found.");
		
		index = searchBySalary(arr, 90000);
		if (index != -1)
			System.out.println("Employee found : " + arr[index]);
		else
			System.out.println("Employee not found.");
	}

}
