package com.rays.string;

public class Occurrence {
public static void main(String[]args) {
	
	int count=0;
	String s= "vijay dinanath";
			char c='a';
	for(int i=0;i<s.length( );i++)
	{
		if(s.charAt(i)==c) {
			count++;
		}
	}
System.out.println(count);
}
}
