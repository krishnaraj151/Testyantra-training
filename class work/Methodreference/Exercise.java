package com.testyantra.Methodreference;



public class Exercise {

	
	public void chat() {
		System.out.println("message form chat");
	}
	
	public static void test() {
		System.out.println("message form test");
	}
	
	public static void main(String[] args) {
		Test t = new Exercise()::chat;
		t.message();
	
		Test t1= Exercise::test;
		t1.message();
	}
}
