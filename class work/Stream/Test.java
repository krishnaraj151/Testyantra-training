package com.test.Stream;

import java.util.*;
import java.util.stream.Stream;

public class Test {
	
	

	public static void main(String[] args) {
	List<Employee> asList=Arrays.asList(new Employee(1,"krishna","developer",40000)
			,new Employee(2,"raj","tester",50000)
			,new Employee(3,"harish","developer",60000)
			,new Employee(4,"abishek","developer",30000));
	
	Stream<Employee> stream = asList.stream();
	
	asList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
	
	System.out.println("any match");
	boolean anymatch = asList.stream().anyMatch(emp->emp.getName()=="krishna");
	
	
	
	}


	}
	
	
	
	
	
	




