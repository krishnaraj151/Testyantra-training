package com.test.collection;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	
	int n;
	String name;
	String roll;
	int s;

	public Employee(int n, String name, String roll, int s) {
		this.n=n;
		this.name=name;
		this.roll=roll;
		this.s=s;
		
	}

	@Override
	public String toString() {
		return "Employee [n=" + n + ", name=" + name + ", roll=" + roll + ", s=" + s + "]";
	}

	@Override
	public int compare(Employee arg0, Employee arg1) {
		
		return 0;
	}



	
}

