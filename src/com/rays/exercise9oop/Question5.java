package com.rays.exercise9oop;

public class Question5 {
public static void main(String[] args) {
	ImmutableClass i=new ImmutableClass("ruchi", "12345");
	System.out.println(i.getName());
	System.out.println(i.getAccountNo());
	
	
	ImmutableClass j=new ImmutableClass("rohan","1234567");
    System.out.println(j.getName());
    System.out.println(j.getAccountNo());
}}
