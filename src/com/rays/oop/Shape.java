package com.rays.oop;

public class Shape {
	private String color;
	private double borderWidth;
	public static double PI = 3.14;

	public Shape() {

	}

	public Shape(String c, double b) {
		color = c;
		borderWidth = b;
	}

	public String getColor() {
		return color;
	}

	public double getBorderWidth() {
		return borderWidth;
	}
	

	
	  public void setColor(String color) {
		  this.color = color;
		  }
	  
	  public void setBorderWidth(double borderWidth) {
		  this.borderWidth = borderWidth; 
		  }
	  public double area() {
			return 0;
		}
}
