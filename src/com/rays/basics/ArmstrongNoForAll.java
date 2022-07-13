package com.rays.basics;

public class ArmstrongNoForAll {
public static void main(String[] args) {
      int number=54748;
      int temp=number;
      int num=number;
      int count=0;
      int rim=0;
      int sum=0;
      
      while(num>0) {
    	 
    	  num=num/10;
    	  count++;
      }
     int pow=0; 

     while(number>0) {
	 rim=number%10;
	 pow=(int) Math.pow(rim, count);
	 number=number/10;
	 sum=sum+pow;
    }
    if(temp==sum) {
	 System.out.println("number is armstrong");
    }
    else {
	 System.out.println("number is not armstrong");
    }
}
}
