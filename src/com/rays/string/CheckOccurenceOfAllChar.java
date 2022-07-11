package com.rays.string;

public class CheckOccurenceOfAllChar {

	public static void main(String[] args) {
	
		 String name="Vijay Dinanath Chauhan";
		 String n1= name.toLowerCase(); 
		  
	   for(char i='a';i<='z';i++) {
		   int count=0;
		   for(int j=0;j<n1.length();j++) {
			   if(n1.charAt(j)==i) {
				   count++;
			   }
		   }
		   if(count!=0) {
			   
			   System.out.println(i+" occurence time "+count);
		   
		   }
	   }
}
}
