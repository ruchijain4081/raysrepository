package com.rays.basics;

public class MissingElement {
public static void main(String[] args) {
	int x =0;
	int []a = {100,113,213,224,842,255};
	int[]b = {113,255,100,842,224};
	for(int i=0;i< a.length;i++) {
		for(int j=0;j< b.length;j++) {
			if(a[i]==b[j]) {
				break;
			}
			else {
				if(j==(b.length-1)) {
					System.out.println("the missing no is ="+a[i]);
				}
			}
		}
	}
}
}
