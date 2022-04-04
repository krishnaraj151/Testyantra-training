package com.test.Treeset;


public class Demo implements Comparable<Demo> {
		
		int n;
		String name;



		public Demo(int n, String name) {
			this.n=n;
			this.name=name;

		}


		@Override
		public String toString() {
			return "Student [n=" + n + ", name=" + name + "]";
		}


	


		@Override
		public int compareTo(Demo o1) {
			// TODO Auto-generated method stub
			return this.name.compareTo(o1.name);
			
		}



	

}
