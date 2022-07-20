package com.rays.exercise9oop;

public class Question6 {
	public void m1(int i, double j) {
		System.out.println(i + j);
	}

	public void m1(char i, char j) {
		System.out.println(i + j);
	}
	public void m1(String i,int j) {
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		Question6 r=new Question6();
		r.m1(10,20);
		r.m1(10,'a');
		r.m1("ruchi", 10);
		r.m1('a', 'b');
	}
}
