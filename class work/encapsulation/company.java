package com.test.encapsulation;

public class company {
	
	public static void main(String[] args) {
		employee e=new employee();
		e.setAge(22);
		e.setName("krishna");
		e.setSalary(200000);
		e.setDesignation("developer");
		
		
		System.out.println(e.getAge());
		
		System.out.println(e.getName());
		System.out.println(e.getDesignation());
		System.out.println(e.getSalary());
	}
}
