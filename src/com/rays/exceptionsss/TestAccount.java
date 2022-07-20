package com.rays.exceptionsss;

public class TestAccount {
public static void main(String[] args) {
	Account a=new Account();
	a.setNumber("123456");
	a.setAccountType("Saving");
	a.setBalance(2000);
	
	System.out.println("Account no :"+a.getNumber());
	
	System.out.println("Account type : "+a.getAccountType() );
	
	System.out.println("your current balance is :"+a.getBalance());
	
	a.deposit(40000);
	System.out.println("your current balance is :"+a.getBalance());
	
	a.withdrawal(40000);
	System.out.println("your current balance is :"+a.getBalance());

}
}
