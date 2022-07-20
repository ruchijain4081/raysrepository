package com.rays.constructor.copy;

public class Test {
public static void main(String[] args) {
	ConstructorCallingByConst i=new ConstructorCallingByConst(10,10);
	ConstructorCallingByConst j=new ConstructorCallingByConst(10,20,'a');
	CallParentCons m=new CallParentCons (2,5); 
}
}
