package com.test.Treeset;

import java.util.*;


public class Main {
	
public static void main(String[] args) {
		
		Demo student= new Demo(1,"krishna");
		Demo student2= new Demo(2,"raj");
		Demo student3= new Demo(3,"harish");
		Demo student4= new Demo(4,"niyaz");
		Demo student5= new Demo(4,"sukumar");
		
	TreeSet<Demo> treeset = new TreeSet<>();
	 treeset.add(student);
	 treeset.add(student2);
	 treeset.add(student3);
	 treeset.add(student4);
	 treeset.add(student5);
		
		   ArrayList <Demo> arraylist = new ArrayList<>( treeset);
		   Collections.sort(arraylist,new Sortbyname());
		   
		   for(Demo std:arraylist) {
				System.out.println(std);
			}
		
	}

}
