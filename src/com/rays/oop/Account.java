package com.rays.oop;

public class Account {
private String number;
private String accountType;
private double balance;
public void setNumber(String num) {
	number=num;
}
public String getNumber() {
	return number;
}
public void setAccountType(String at) {
	accountType=at;
}
public String getAccountType() {
	return accountType;
}
public void setBalance(double b) {
	balance= b;
	
}
public double getBalance() {
	//System.out.println("your current balance : ");
	return balance;
}
public void deposit(double d) {
	double current=d+ getBalance();
	System.out.println(d+" amount deposited to your account");
	setBalance(current);
	
}
public void withdrawal(double w) {
	double current1= getBalance()-w;
	System.out.println(w+" amount withdrawal to your account");
	setBalance(current1);

}
public void fundTransfer(String ac,double amount) {
	System.out.println(amount+" transfer to the account no "+ac);
	double d=getBalance()-amount;
	setBalance(d);
	System.out.println("fund transfered successfully");
   
}

}
