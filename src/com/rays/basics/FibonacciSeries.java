package com.rays.basics;

public class FibonacciSeries {
public static void main(String[] args) {
	int number = 6;
	int firstno = 0;
	int secondno =1;
	for(int i=0;i<=number;i++){
		int sum = firstno+secondno;
		firstno=secondno;
		secondno=sum;
		System.out.println( firstno+" " +secondno );
	}
}
}
