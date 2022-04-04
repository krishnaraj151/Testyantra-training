package com.test.arithmeticexception;

public class Example {
	public static void main(String[] args) {
		System.out.println("program begin");
		try{
			throw new ArithmeticException();
	}
		catch (Exception e) {
	
			
//		e.printStackTrace();
		}
		System.out.println("program end");
	}
	

}
