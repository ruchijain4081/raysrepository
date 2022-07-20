package com.rays.oop;

public class StaticBlock {
public static void main(String[] args) {
System.out.println("main method");	
}
static {
	System.out.println("static block ");
}
//static block executed first if class has main method   

}
