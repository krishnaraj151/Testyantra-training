package com.test.assignment4;

public class Employee extends Member {
	
	String specialization;
	public Employee(String Name, int age, long phonenumber, String address, int salary, String specialization) {
		super(Name, age, phonenumber, address, salary);
		this.specialization=specialization;
		System.out.println(specialization);
	}


}
