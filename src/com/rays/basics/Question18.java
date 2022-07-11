package com.rays.basics;

public class Question18 {
	public static void main(String[] args) {
		int x = 30;
		int[] numbers = { 10, 20, 30, 40, 50 };
		System.out.println("position = " + findPosition(x, numbers));
	}

	static int findPosition(int a, int[] num) {
		int y = 0;
		int c = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == a) {
				c++;
				y = i;
				return y;
			}
		}
		if (c == 0) {
			y = -1;
			return y;

		}
		return y;
	}

}
