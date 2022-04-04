package com.test.Arraysort;

import java.util.*;

public class Demo {
	
	
	
	public static void main(String[] args) {
		
		int temp;
		System.out.println("enter the no of array u want");
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int a[]= new int[x];
		System.out.println("enter the array value ");
		for (int j = 0; j <x; j++) {
			a[j]=sc.nextInt();
		}
        for (int  j= 0;  j<x; j++) {
         for (int i = j+1; i < x; i++) {
		  if(a[j]>a[i]) {
			  temp=a[j];
			  a[j]=a[i];
			  a[i]=temp;
			  
		  }
		}			
		}		
		
System.out.println("order");
for (int j = 0; j <x-1; j++) {
	System.out.println(a[j]);

}
	
	
	}
}
