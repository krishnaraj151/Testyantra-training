package com.test.Linkedhashset;

import java.util.*;

public class Main {
	
public static void main(String[] args) {
		
		Demo student= new Demo(1,"krishna");
		Demo student2= new Demo(2,"raj");
		Demo student3= new Demo(3,"harish");
		Demo student4= new Demo(4,"niyaz");
		Demo student5= new Demo(4,"sukumar");
		
		LinkedHashSet<Demo> linkedhashset = new LinkedHashSet<>();
		linkedhashset.add(student);
		linkedhashset.add(student2);
		linkedhashset.add(student3);
		linkedhashset.add(student4);
		linkedhashset.add(student5);
		
		   ArrayList <Demo> arraylist = new ArrayList<>(linkedhashset);
		   Collections.sort(arraylist,new Sortbyname());
		   
		   for(Demo std:arraylist) {
				System.out.println(std);
			}
		
	}}
