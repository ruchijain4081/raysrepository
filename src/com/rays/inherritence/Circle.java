package com.rays.inherritence;

public class Circle extends Shape{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
 public double area() {
	return PI*radius*radius;
}
	}


