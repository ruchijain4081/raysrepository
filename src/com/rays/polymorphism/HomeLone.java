package com.rays.polymorphism;

public class HomeLone {
public static void main(String[] args) {
	Bank []bank= new Bank[3];
	bank[0]=new AxisBank();
	bank[1]=new HDFCBank();
	bank[2]=new ICICIBank();
	AxisBank a= (AxisBank) bank[0];
	HDFCBank h=(HDFCBank) bank[1];
	ICICIBank ic=(ICICIBank) bank[2];
	for(int i=0;i<bank.length;i++) {
		String name=bank[i].getName();
		double rate=bank[i].interestRate(); 
		System.out.println("name :"+name+" rate:"+rate);
	}
	for(Bank b:bank) {
		String name=b.getName();
		double rate=b.interestRate(); 
		System.out.println("name :"+name+" rate:"+rate);
	
	}
}

}

