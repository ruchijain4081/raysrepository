package com.rays.basics;

public class Average {
public static void main(String[] args) {
	int x=0;
	int y=0;
	int evensum =0;
	int oddsum=0;
	for (int i=1;i<=12;i++) {
		if(i%2==0) {
			 evensum=i+evensum;
			x++;
		}
		else {
			oddsum =i + oddsum;
			y++;
		}
	}
	int oddaverage= oddsum/y;
	int evenaverage= evensum/x;
	System.out.println(+evenaverage);
	System.out.println(+oddaverage);
}
}
