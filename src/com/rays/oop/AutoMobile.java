package com.rays.oop;

public class AutoMobile {
private String color;
private String make;
private int speed;
public static int numbersOfGears=5;
public void setColor(String c) {
	color=c;	
}
public String getColor() {
	return color;
}
public void setMake(String m) {
	make=m;
}
public String getMake() {
	return make;
}
public void setSpeed(int s) {
	speed=s;
}
public int getSpeed() {
	return speed;
}
public void breakk(int speed) { 
	if (speed>80) {
		System.err.println("warning: slow down your speed");
	}
}
public void changeGear() {
	System.out.println("change gear after every 20 kilometers");
}
public void accelerator(int speed) {
	if (speed<30) {
		System.out.println("press accelerator to speedup");
	}
}
}
