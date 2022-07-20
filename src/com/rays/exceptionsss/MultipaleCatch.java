package com.rays.exceptionsss;

public class MultipaleCatch {
public static void main(String[] args) {
	int[]i= {10};
	int j=0;
	try {
		System.out.println(i[2]);
		System.out.println(i[0]/j);
	}
	catch(ArrayIndexOutOfBoundsException e ) {
		System.out.println(e.getMessage());
		System.out.println(e);
		 System.out.println(e.toString());
	}
	catch(ArithmeticException f) {
		System.out.println(f.getMessage());
		System.out.println(f);
		 System.out.println(f.toString());
	
	}
}
}
