package com.rays.abstracttt;

public abstract class Shape {
	private String color;
	private double borderWidth;
	public static double PI=3.14;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(double borderWidth) {
		this.borderWidth = borderWidth;
	}
	public abstract double area(); 

}
