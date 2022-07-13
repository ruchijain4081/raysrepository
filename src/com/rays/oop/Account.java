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
	return balance;
}
public void deposit(double d) {
	double current=d+ getBalance();
	setBalance(current);
	fundTransfer();
}
public void withdrawal(double w) {
	double current1= getBalance()-w;
	setBalance(current1);
	fundTransfer();
}
public void fundTransfer() {
	System.out.println("fund transfered successfully");
}

}
