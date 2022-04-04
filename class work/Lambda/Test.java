package com.testyantra.Lambda;

public class Test {
	public static void main(String[] args) {
		MyFunctionalInterface obj=(x,y)->{
			return x+y;
		};
		int add = obj.add(109, 200);
		System.out.println(add);
	}
	

}
