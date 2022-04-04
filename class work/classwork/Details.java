package com.test.classwork;

import java.util.HashSet;

public class Details {
	
	public static void main(String[] args) {
		
		Student student= new Student(1,"krishna");
		Student student2= new Student(2,"raj");
		Student student3= new Student(3,"harish");
		Student student4= new Student(4,"niyaz");
		Student student5= new Student(4,"sukumar");
		
		HashSet<Student> hashset = new HashSet<>();
		hashset.add(student);
		hashset.add(student2);
		hashset.add(student3);
		hashset.add(student4);
		hashset.add(student5);
		
		for(Student std:hashset) {
			System.out.println(std);
		}
		
	}

}
