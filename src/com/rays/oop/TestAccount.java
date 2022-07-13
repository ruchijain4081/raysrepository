package com.rays.oop;

public class TestAccount {
public static void main(String[] args) {
	Account a=new Account();
	a.setNumber("123456");
	a.setAccountType("Saving");
	a.setBalance(2000);
	
	System.out.println("Account no :"+a.getNumber());
	
	System.out.println("Account type : "+a.getAccountType() );
	
	System.out.println("initial balance : "+a.getBalance());
	
	a.deposit(40000);
	System.out.println("current balance : "+a.getBalance());
	
	a.withdrawal(10000);
	System.out.println("current balance : "+a.getBalance());
	
}
}
