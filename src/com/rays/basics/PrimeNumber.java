package com.rays.basics;

public class PrimeNumber {
   public static void main(String[] args) {
	int num = 5;
	int count =0;
	for(int i=2;i<num;i++) {
		if(5%i==0) {
	 count = 1;	
			break;
		}
	}
	if (count==0) {
		System.out.println("number is prime");}
		else {
			System.out.println("number is not prime");
		}
	}
}
