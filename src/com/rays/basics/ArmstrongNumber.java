package com.rays.basics;

public class ArmstrongNumber {
 public static void main(String[] args) {
	 int number=1634;
	 int temp=number;
	 int rim=0;
	 int cube=0;
	 int sum=0;
	 while(number>0) {
		 rim=number%10;
		 cube=rim*rim*rim;
		 number=number/10;
		 sum=sum+cube;
	 }
	 if(temp==sum) {
		 System.out.println("numb er is armstrong");
	 }
	 else {
		 System.out.println("number is not armstrong");
	 }
 }
}
