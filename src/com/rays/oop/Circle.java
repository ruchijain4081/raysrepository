package com.rays.oop;

public class Circle extends Shape {
	private double redius;
	
public Circle(double redius) {
	
		this.redius = redius;
	}


public double area() {
	double x=PI*redius*redius;
	return x;
}
public double perimeter() {
	double x=2*PI*redius;
	return x;
}
}
