package com.test.Linkedhashset;

import java.util.*;




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


	public int Compareto(Demo o1) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o1.name);
	}


	@Override
	public int compareTo(Demo arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}