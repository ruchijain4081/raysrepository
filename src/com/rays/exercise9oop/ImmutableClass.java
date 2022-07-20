package com.rays.exercise9oop;

final class ImmutableClass {
private final String name;
private final String accountNo;
public ImmutableClass(String name, String accountNo) {
	
	 this.name = name;
	this.accountNo = accountNo;
}
public String getName() {
	return name;
}
public String getAccountNo() {
	return accountNo;
}

}
