package com.testyantra.Staticinterface;

public interface Test1 {
	
	default void message() {
		System.out.println("Hai");
	}

}
