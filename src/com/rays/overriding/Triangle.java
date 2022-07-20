package com.rays.overriding;

public class Triangle extends Shape {
	private double base;
	private double hight;

	public Triangle(double base, double hight) {
		
		this.base = base;
		this.hight = hight;
	}

	public double area( ) {
		double x = (base * hight) / 2;
		return x;
	}

	public double perimeter(double base, double side2, double side3) {
		double x = base + side2 + side3;
		return x;
	}

}
