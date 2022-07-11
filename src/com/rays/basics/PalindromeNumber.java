package com.rays.basics;


public class PalindromeNumber {
 public static void main(String[] args)  {
	 int number1=53435;
	 System.out.print(number1);
	 int number2=number1;
	 int number3=0;
	 while(number1>0) {
		 number3=number1%10+number3*10;
		 number1=number1/10;
	 }
	 if(number2==number3) {
		 System.out.print(" is pelindrome");
	 }
	 else {
		 System.out.print(" is not pelindrome");

	 }
 }
}
