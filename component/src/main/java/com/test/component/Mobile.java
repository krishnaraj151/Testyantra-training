package com.test.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Mobile {
     @Value(value = "sasi")
	String name;
     @Value(value = "redmi")
	String brand;
     @Value(value = "2345")
	String price;
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
     
     
	
     
}
