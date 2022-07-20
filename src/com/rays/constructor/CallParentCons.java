package com.rays.constructor;

public class CallParentCons extends Parent{ 
	public CallParentCons() {
		
	}

	public CallParentCons(int no, int acc) {
		super(no, acc);
		System.out.println("child constructor");
	}

}
