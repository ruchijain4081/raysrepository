package com.rays.oop;

public class TestAutoMobile {
	public static void main(String[] args) {
	AutoMobile a=new AutoMobile();
	int s=40;
	a.setColor("black");
	a.setMake("Tata Moters");
	a.setSpeed(s);
	a.changeGear();
	a.breakk(s);
	a.accelerator(s);
	System.out.println("color of the car : "+a.getColor());
	System.out.println("brand of the car: "+a.getMake());
	System.out.println("speed of your car : "+a.getSpeed());
	System.out.println("gears in your car : "+a.numbersOfGears);
	
	
	}

}
