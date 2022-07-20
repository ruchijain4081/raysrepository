package com.rays.polymorphism;

public  class Shape {
	private String color;
	private double borderWidth=0;
	public static double PI = 3.14;

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

	public double area() {
		System.out.println("parent");
		return 0;
	}

	public static Shape ratShape(int i) {
		if (i == 1) {
			return new Rectangle();
		}
		if (i == 2) {
			return new Triangle();
		}
		if (i == 3) {
			return new Circle();
		}
		return null;

	}



}
