package com.rays.exercise9oop;

public class Person {
private String firstName;
private String lastName;
public Person(String firstName, String lastName) {
	
	this.firstName = firstName;
	this.lastName = lastName;
}
public  String toString() {
	return firstName+lastName;
}

}
