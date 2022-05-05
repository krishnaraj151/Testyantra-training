package com.test.assignment4;

public class Manager extends Member {
 
	
	String department;
	public  Manager(String Name, int age, long phonenumber, String address, int salary, String department) {
		super(Name, age, phonenumber, address, salary);
		this.department=department;
		System.out.println(department);
	}
	
	

}
