package com.rays.constructor.copy;

public class ConstructorOverloading {
private String name;
private String address;
private int number;
public ConstructorOverloading() {
	
}
public ConstructorOverloading(String name, String address, int number) {
	
	this.name = name;
	this.address = address;
	this.number = number;
}
public ConstructorOverloading(int number,String address) {
	this.number=number;
	this.address=address;
} 

}
