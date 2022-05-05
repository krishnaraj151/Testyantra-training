package com.test.Leftarrayrotate;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
	
			System.out.println("enter the  number of arrays");
			Scanner sc = new Scanner(System.in);
			int x=sc.nextInt();
			int a[]= new int[x];
			
			System.out.println("enter the array values");
			
			for (int i = 0; i <a.length; i++) {
			  a[i]=sc.nextInt();
			}
			
			for (int i = 0; i < 3; i++) {
				int j,f;
				f=a[0];
			     for ( j =0; j < a.length-1; j++) {
					a[j]=a[j+1];
					
				}
			     a[j]=f;
			}
			
			System.out.println("the left rotate is:");
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
			
			
			
			

}
}