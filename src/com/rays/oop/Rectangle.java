package com.rays.oop;

public class Rectangle extends Shape{
	private double length;
	private double width;
	public Rectangle (double length,double width) {
		this.length=length;
		this.width=width;
	}
	public double area() {
		double x=length*width;
		return x;
	}
	public double perimeter() {
		double x= 2*(length*width);
		return x;
	}

}
