package com.test.collection;

import java.util.*;

public class Demo {

	
	public static void main(String[] args) {
		 
	ArrayList list =new ArrayList();
	list.add(20);
	list.add(10);
	list.add(30);
	list.add(40);
	list.add(10);
	
	System.out.println(list);
	
	List l = new ArrayList();
	l.add(100);
	l.add(200);
	l.add(400);
	l.add(300);
	
	System.out.println(l);
	list.addAll(l);
	
	System.out.println(list);
	List li =new ArrayList();

	
   li.add(20000);
	System.out.println(li);
	
	
	
	
		
	}
}
