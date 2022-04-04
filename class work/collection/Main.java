package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;

import com.test.Hashset.SortbyName;
import com.test.collection1.Student;


public class Main {
	
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
		
		   ArrayList <com.test.collection.Student> arraylist = new ArrayList<>(hashset);
		   Collections.sort(arraylist,new SortbyName());
		   
		   for(com.test.collection.Student std:arraylist) {
				System.out.println(std);
			}
		
	}

}
