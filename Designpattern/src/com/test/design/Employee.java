package com.test.design;

public class Employee {

	static Employee e;

	private Employee() {
	}

	public static Employee getobject() {
		if (e == null) {
			new Employee();
		}
		return e;
	}
}