package com.test.tostring;

public class Laptop {
       
	String brand;
	Rom rom;
	Battery battery;
	Screen screen;
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", rom=" + rom + ", battery=" + battery + ", screen=" + screen + "]";
	}
	 
	
}
