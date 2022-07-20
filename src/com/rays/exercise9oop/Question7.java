package com.rays.exercise9oop;

public class Question7 {
public static void main(String[] args) {
	Parent p=new Parent();
	p.method();
	Parent p1=new Child();
	p1.method();
	Child c= new Child();
	c.method();
}
}
