package com.test.Arrayfrequency;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
	 int v=-1;
		System.out.println("enter the  number of arrays");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int a[]= new int[x];
		int b[]=new int[a.length];
	
		System.out.println("enter the array values");
		
		for (int i = 0; i <x; i++) {
		  a[i]=sc.nextInt();
		}
		for (int i = 0; i <a.length; i++) {
               int count=1;
			for (int j = i+1; j <a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=v;
				}
				if(b[i]!=v) {
					b[i]=count;
				}
			}
		}
		
		
		for (int i = 0; i <a.length; i++) {
			if(b[i]!=v) {
			System.out.println(" "+a[i] +" | " +b[i]);
		
		}
		}
		
		
		
	}

}


//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ArrayCountOccrenceAll1 {
//	private static Scanner sc;
//	
//	public static void main(String[] args) {
//		int Size, i, j, count;
//		
//		sc = new Scanner(System.in);
//		
//		System.out.print("Please Enter Frequency Array size = ");
//		Size = sc.nextInt();
//		
//		int[] arr = new int[Size];
//		int[] freq = new int[Size];
//		Arrays.fill(freq, -1);
//		
//		System.out.format("Enter Frequency Array %d elements : ", Size);
//		for(i = 0; i < Size; i++) 
//		{
//			arr[i] = sc.nextInt();
//		}
//		
//		for(i = 0; i < arr.length; i++)
//		{
//			count = 1;
//			for(j = i + 1; j < arr.length; j++)
//			{
//				if(arr[i] == arr[j])
//				{
//					count++;
//					freq[j] = 0;
//				}
//			}
//			if(freq[i] != 0)
//			{
//				freq[i] = count;
//			}
//		}
//		System.out.println("The Frequency of All the Elements in this Array ");
//		
//		for(i = 0; i < arr.length; i++) 
//		{
//			if(freq[i] != 0)
//			{
//				System.out.println(arr[i] + " Occurs " + freq[i] + " Times.");
//			}
//		}
//	}
//}
