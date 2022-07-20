package com.rays.exceptionsss;

public class NestedTryCatch {
public static void main(String[] args) {
	String s="vijay";
	int i=0;
	int j=10;
	try { 
		System.out.println(10/0);
	}catch(ArithmeticException e) {
		e.printStackTrace();
		try {
			System.out.println(s.charAt(4));
		}catch(StringIndexOutOfBoundsException f) {
			f.printStackTrace();
		}
	}
	//System.out.println();
}
}
