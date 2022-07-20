package com.rays.exceptionsss;

public class TwoExceptionThrow {

	public static void main(String[] args) {

		CanNotWithdrawal w = new CanNotWithdrawal();

		SelfException s = new SelfException();
		int i = 0;

		try {

			System.out.println(10 / 10);

			throw w;
			
		
		} catch (CanNotWithdrawal e) {
			e.printStackTrace();
         try {
        	 throw s;
         }catch(SelfException g) {
        	 g.printStackTrace();
         }
		}
	}
}
