package com.test.accessspecifier;

public class demo2 {

	public int x=10;
	private int y = 20;
	int z=30;
	protected int a=40;
	
	public void y()
	{
		System.out.println(y);
	}
	
	
	
	public static void main(String[] args) {
		demo2 demo= new demo2();
		System.out.println(demo.x);
		System.out.println(demo.y);
		System.out.println(demo.z);
		System.out.println(demo.a);
		
		
		demo.y();
	}
}
