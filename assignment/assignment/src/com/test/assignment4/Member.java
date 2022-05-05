package com.test.assignment4;

public class Member { 
	int age;
	String Name;
	long phonenumber;
	String address;
	long salary;
	
	public  Member(String Name, int age, long phonenumber, String address, long salary){
		this.Name = Name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.address = address;
		this.salary = salary;
		

	}
	

    public void Name() {
    	System.out.println("Name:" +Name);
    }
    
 
    
    public void age() {
    	System.out.println("age:" +age);
    }
    
    public void phonenumber() {
    	System.out.println("phonenumber:" +phonenumber);
    }
    
    public void address() {
    	System.out.println("address:" +address);
    }
    
	public void printsalary() {
		System.out.println("salary:" +salary);
	}

}
