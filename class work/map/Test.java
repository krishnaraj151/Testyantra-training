
package com.test.map;

import java.util.*;
import java.util.Map.Entry;

public class Test {
	
	public static void main(String[] args) {
		HashMap<String,Long> map=new HashMap<>();
		
		map.put("krishna", 737381455l);
		map.put("raj", 737123334825l);
		map.put("ajay", 73735867825l);
		map.put("raju", 73735867825l);
		map.put("bheem", 73735867825l);
		
		Set<String> keySet = map.keySet();
		for (String name : keySet) {
			System.out.println(name+" "+map.get(name));
		}
		
		
		
		
		
		
		
		System.out.println("==================");
		Set<Entry<String, Long>> entrySet = map.entrySet();
		Iterator<Entry<String, Long>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
		System.out.println(iterator.next());
		
	                  		
		}
		
	}

}
