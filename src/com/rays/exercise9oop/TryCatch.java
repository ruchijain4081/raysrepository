package com.rays.exercise9oop;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int c = 10 / 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
