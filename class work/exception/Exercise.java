package com.test.exception;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		
		try {
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the first number");
			int a=sc.nextInt();
			System.out.println("enter the second number");
			int b=sc.nextInt();
            int res=0;
            res=a/b;
		int  x[]=new int[res];
     x[4]=20;
     
     System.out.println(x[4]);
     System.out.println(res);
     
		}catch(ArrayIndexOutOfBoundsException  e){
			 System.out.println("this is an expection");
			}
		catch(ArithmeticException e) {
			System.out.println("greater than 0");
		}
        
	
		System.out.println("program end");
		
	}

}
