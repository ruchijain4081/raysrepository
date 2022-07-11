package com.rays.basics;

public class SecondLargestNo {
	public static void main(String[] args) {
		int[] numbers = { 10, 26, 45, 78, 56 ,54,30,5666};
		secondLargest(numbers);
	}

	public static void secondLargest(int[] num) {
		int y = 0;
		int x = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i]>x) {
				y = x;
				x= num[i];
			} else {
				if (num[i] > y &&  num[i]<x) {
					y = num[i];
				}
			}
		}
		System.out.println(y);
	}
}
