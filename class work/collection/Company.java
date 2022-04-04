
package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import com.test.Hashset.SortbyName;

public class Company {
	
 

public static void main(String[] args) {
	
	
	
	   Employee krishna= new Employee(1,"krishna","trainee",30000);
	   Employee mohan= new Employee(2,"mohan","trainee",30000);
	   Employee harish= new Employee(3,"harish","trainee",30000);
	   Employee maddy= new Employee(4,"maddy","trainee",30000);
	   Employee naveen= new Employee(5,"naveen","trainee",30000);
	   
	   ArrayList <Employee> a = new ArrayList<>();
	   a.add(krishna);
	   a.add(naveen);
	   a.add(harish);
	   a.add(mohan);
	   a.remove(maddy);
	   
	   

		Scanner sc=new Scanner(System.in);
		int option =sc.nextInt();
		System.out.println("enter the option u want");
		System.out.println("sortbyid"+" sortbyname");
		
		switch(option)
		{
		case 1:	SortbyId sortbyid   =new SortbyId();
		 Collections.sort(a,sortbyid);
		break;
		case 2:SortbyName sortbyname   =new SortbyName();
		  Collections.sort(a,sortbyname);
		break;
		
		}

	   

	  
    Iterator<Employee> iterator= a.iterator();
    while(iterator.hasNext()){
    	System.out.println(iterator.next());
    }
}
}
