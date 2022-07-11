package com.rays.basics;

public class ReverseDigits {
public static void main(String[] args) {
	int num=341;
	int reminder=0;
	while(num>0)
	{
		reminder=num%10;
		System.out.print(reminder);
		num=num/10;
	}
 }
}