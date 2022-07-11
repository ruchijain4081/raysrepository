package com.rays.string;

public class PrintAllMethod {
	public static void main(String[] args) {
		printAll(args);
	}

	private static void printAll(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "name is= " + args[i]);
		}

	}

}
