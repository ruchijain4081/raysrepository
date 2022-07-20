package com.rays.constructor;

public class ConstructorCallingByConst {
private int i;
private double j;
private char m;
public ConstructorCallingByConst(int i, double j, char m) {
	
	this(i, j);
	this.m = m;
	System.out.println("three parameter");
}
public ConstructorCallingByConst(int i,double j) {
this.i=i;
this.j=j;
System.out.println("two parameter");
}
}