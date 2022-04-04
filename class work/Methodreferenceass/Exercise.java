package com.testyantra.Methodreferenceass;

import java.util.*;

public class Exercise {
	
	public int chat(int x,int y) {
		return x+y;
	}
	
	public static int test(int x,int y) {
		return x-y;
	}
	
	public static void main(String[] args) {
		Main t = new Exercise()::chat;
	   int a = t.message(10,20);
	
		Main t1= Exercise::test;
		int b=t1.message(100,10);
		
		
		
		System.out.println(a);
		System.out.println(b);
	}

}
