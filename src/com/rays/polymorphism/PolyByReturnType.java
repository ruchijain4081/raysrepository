package com.rays.polymorphism;

public class PolyByReturnType {
	public static void main(String[] args) {

		Rectangle r = (Rectangle) Shape.ratShape(1);
		r.setLength(10);
		r.setWidth(12);
		System.out.println(r.area());
		Triangle t = (Triangle) Shape.ratShape(2);
		t.setBase(12);
		t.setHight(30);
		System.out.println(t.area());
		Circle c =  (Circle) Shape.ratShape(3);
		c.setRadius(5);
		System.out.println(c.area());
		Shape s = Shape.ratShape(2);
		
		System.out.println(s.area());

	}
}
