package com.test.collection;

public class MyArrayList {
	
	private Object[] array;
	private int size=10;
	int position;
	
	public MyArrayList() {
		array =new Object[size];
		}
	
	public void add(Object obj) {
		if(position>=size) {
			increasecapacity();
			}
		
		array[position]=obj;
		position++;
	}

	private void increasecapacity() {
		this.size=((size*3)/2)+1;
		Object[] temp  = new Object[size];
		
		for(int i=0;i<array.length;i++) {
			temp[i]=array[i];
			
		}
		array=temp;
	}
	
	
	public void test() {
		for(int i=0;i<array.length;i++) {
System.out.println(array[i]);
			
		}
		
	}
	
	public Object get(int index) {
		return array[index];
	}

}
