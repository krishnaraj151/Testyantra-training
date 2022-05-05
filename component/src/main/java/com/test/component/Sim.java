package com.test.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Sim {
	
	@Value(value ="jio")
	String name;
	@Value(value = "34567")
	String number;
	@Override
	public String toString() {
		return "Sim [name=" + name + ", number=" + number + "]";
	}
	
	

}
