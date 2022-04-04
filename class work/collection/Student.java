package com.test.collection;

import java.util.Comparator;

public class Student implements Comparator<Main> {
		
		int n;
		String name;



		public Student(int n, String name) {
			this.n=n;
			this.name=name;
		
			
		}



		@Override
		public int compare(Main arg0, Main arg1) {
		
			return 0;
		}



		@Override
		public String toString() {
			return "Student [n=" + n + ", name=" + name + "]";
		}


	
		
		
	}


