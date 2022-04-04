package com.test.tostring;

public class Flipcart {
	
	public static void main(String[] args) {
		
		Laptop laptop=new Laptop();
		
		
		Battery battery=new Battery();
		battery.brand="dell";
		battery.capacity=10000;
		battery.type="lithium";
		
		

	    Rom rom=new Rom();
	    rom.type="lpddrx";
	    rom.clockspeed=2;
	    
		Screen screen=new Screen(); 
		screen.brand="samsung";
		screen.resolution=1080;
		screen.type="oled";
		
		System.out.println(laptop);
		
	}

}
