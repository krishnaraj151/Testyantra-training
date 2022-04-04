package com.test.Treeset;

import java.util.*;

	
	public class Sortbyname implements Comparator<Demo> {

		@Override
		public int compare(Demo o1, Demo o2) {
			
			 return o1.name.compareTo(o2.name);
		}


}
