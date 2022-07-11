package com.rays.basics;

public class TableInTowDArray {
	public static void main(String[] args) {
		int[][] table;
		table = new int[10][10];
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int x = i * j;
				table[i - 1][j - 1] = x;
				System.out.print(table[i - 1][j - 1] + "\t");
			}
			System.out.println();
		}
	}
}
