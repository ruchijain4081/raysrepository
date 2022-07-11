package com.rays.basics;

public class Factorial {
public static void main(String[] args) {
	int number = 6;
	int x = 1;
	for(int i=1;i<=number;i++) {
		x =x*i;
	}
	System.out.println("the factorial of number is " +x);
}
}
