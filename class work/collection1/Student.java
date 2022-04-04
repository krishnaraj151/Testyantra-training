package com.test.collection1;

import java.util.Comparator;

import com.test.collection.Main;

public class Student implements Comparator<Main> {
	
	int n;
	String name;



	public Student(int n, String name) {
		this.n=n;
		this.name=name;

	}

	@Override
	public String toString() {
		return "Student [n=" + n + ", name=" + name + "]";
	}

	@Override
	public int compare(Main arg0, Main arg1) {
	
		return 0;
	}
	
	
}