package com.test.assignment4;

public class Main {

	public static void main(String[] args) {
		Manager manager=new Manager("ragul",32,45678l,"street",30000,"IT");
		Employee employee = new Employee("vijay",43,127634l,"mumbai",23458,"software");
		employee.Name();
		employee.age();
		employee.phonenumber();
		employee.address();
		employee.printsalary();
		
		manager.Name();
		manager.age();
		manager.phonenumber();
		manager.address();
		manager.printsalary();
	
	}
	
}
