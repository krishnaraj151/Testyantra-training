package com.test.assignment7;

public abstract class Abstractclass {
	
	int x;
	static int y;
	
	public Abstractclass() {
	System.out.println("this is a constractor of a abstract class");	
	}


   abstract	void m1();
	
	void m2(){
		System.out.println("this is a normal method of abstract class");
	}

}
