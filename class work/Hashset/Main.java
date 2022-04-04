package com.test.Hashset;

import java.util.*;

public class Main {
	
public static void main(String[] args) {
		
		Demo student= new Demo(1,"krishna");
		Demo student2= new Demo(2,"raj");
		Demo student3= new Demo(3,"harish");
		Demo student4= new Demo(4,"niyaz");
		Demo student5= new Demo(4,"sukumar");
		
		HashSet<Demo> hashset = new HashSet<>();
		hashset.add(student);
		hashset.add(student2);
		hashset.add(student3);
		hashset.add(student4);
		hashset.add(student5);
		
		   ArrayList <Demo> arraylist = new ArrayList<>(hashset);
		   Collections.sort(arraylist);
		   
		   for(Demo std:arraylist) {
				System.out.println(std);
			}
		
	}

}
