package com.test.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
	HashSet<Integer> hashset = new HashSet();
	hashset.add(10);
	hashset.add(20);
	hashset.add(30);
	hashset.add(40);
	hashset.add(50);
	
	Iterator<Integer> iterator=hashset.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	
	System.out.println("==================");
	
	LinkedHashSet<Integer> linkedhashset = new LinkedHashSet();
	linkedhashset.add(10);
	linkedhashset.add(20);
	linkedhashset.add(30);
	linkedhashset.add(40);
	linkedhashset.add(50);
	linkedhashset.add(60);

	
	Iterator<Integer> iterator2=linkedhashset.iterator();
	while(iterator2.hasNext())
	{
		System.out.println(iterator2.next());
	
	}
	
	
	System.out.println("==================");
	
	TreeSet<Integer> treeset = new TreeSet();
	treeset.add(310);
	treeset.add(70);
	treeset.add(30);
	treeset.add(3310);
	treeset.add(360);

	
	Iterator<Integer> iterator3=treeset.iterator();
	while(iterator3.hasNext())
	{
		System.out.println(iterator3.next());
	

}
}
}
