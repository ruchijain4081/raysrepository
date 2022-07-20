package com.rays.abstracttt;

public class TestShape {
public static void main(String[] args) {
	Shape s=new Rectangle();
	s.area();
	s.setBorderWidth(10);
	System.out.println(s.getBorderWidth());
	Rectangle r=new Rectangle();
	r.setBorderWidth(2);
	System.out.println(r.getBorderWidth());
	
}
}
