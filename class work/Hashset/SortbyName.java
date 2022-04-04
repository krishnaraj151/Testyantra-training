package com.test.Hashset;

import java.util.*;

import com.test.collection1.Student;

public class SortbyName implements Comparator<Demo> {

	@Override
	public int compare(Demo o1, Demo o2) {
		
		 return o1.name.compareTo(o2.name);
	}





}
