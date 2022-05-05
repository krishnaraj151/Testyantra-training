package com.test.assignment5;

public class Student {
	
	String Name;
	public Student() {
		Name="unknown";
	}
	
	
	
	public Student(String Name) {
		this.Name=Name;
	}
	
	public void  display()
	{
		System.out.println("Name:" +Name);
	}

}
