package com.rays.abstracttt;

import com.rays.polymorphism.Shape;



public class Triangle extends Shape{
private double base;
private double hight;
public double getBase() {
	return base;
}
public void setBase(double base) {
	this.base = base;
}
public double getHight() {
	return hight;
}
public void setHight(double hight) {
	this.hight = hight;
}
public double area() {
	//System.out.println("child");
	return base*hight;
}
}
