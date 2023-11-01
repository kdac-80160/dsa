package com.sunbeam;

import java.util.Scanner;

public class Employee {
	private int empid;
	private String name;
	private double salary;

	public Employee() {

	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID : ");
		this.empid = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name : ");
		this.name = sc.nextLine();
		System.out.print("Enter Salary : ");
		this.salary = sc.nextDouble();
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

}
