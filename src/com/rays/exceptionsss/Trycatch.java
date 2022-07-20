package com.rays.exceptionsss;

public class Trycatch {
	public static void main(String[] args) {

		int i = 0;
		int j = 10;

		try {
			int h = 10 / 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
