package com.rays.polymorphism;

public class Circle extends Shape{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
 public double area() {
	 System.out.println("circle");
	return PI*radius*radius;
}
	}


