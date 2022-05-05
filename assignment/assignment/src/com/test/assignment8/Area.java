package com.test.assignment8;

public class Area extends Shape{
	
	int rectanglearea(int length,int breath) {
		
		
		return length*breath;
	}

	@Override
	int squarearea(int side) {

		return 4*side;
	}

	@Override
	float circlearea(float radius) {

		return  3.14f*radius*radius;
	}

}
