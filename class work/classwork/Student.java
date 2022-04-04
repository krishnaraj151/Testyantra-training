package com.test.classwork;




public class Student {

		
		int n;
		String name;
		int rollno;
		String department;

		public Student(int n, String name) {
			this.n=n;
			this.name=name;
			
			
		}

		@Override
		public int hashCode() {
			
			return n;
		}

		@Override
		public boolean equals(Object obj) {
	        Student s= (Student) obj;
			return this.n==s.n && s.name.equals(this.name);
		}

		@Override
		public String toString() {
			return "Student [n=" + n + ", name=" + name + "]";
		}

	
    
		

}
