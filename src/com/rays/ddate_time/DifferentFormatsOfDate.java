package com.rays.ddate_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DifferentFormatsOfDate {

	public static void main(String[] args) {

	// first formate is dd.MM.yy.
	Date today=new Date();
	SimpleDateFormat f1=new SimpleDateFormat("dd.MM.yy");
	String s1=f1.format(today);
	System.out.println("Format1=" +s1);
	
	//second format yyyy.MM.dd G 'at' hh:mm:ss z;
	SimpleDateFormat f2=new SimpleDateFormat("yyyy.MM.dd G 'at' hh:mm:ss z");
	String s2=f2.format(today);
	System.out.println("Format2=" +s2);
	
	//third format EEE, MMM d,"yy;
		SimpleDateFormat f3=new SimpleDateFormat(" EEE, MMM d,\"yy");
		String s3=f3.format(today);
		System.out.println("Format3=" +s3);
		
		//fourth format h:mm a;
		SimpleDateFormat f4=new SimpleDateFormat(" h:mm a");
		String s4=f4.format(today);
		System.out.println("Format4=" +s4);
		
		//fifth format H:mm;
		SimpleDateFormat f5=new SimpleDateFormat(" H:mm");
	      String s5=f5.format(today);
				System.out.println("Format5=" +s5);
			
				//sixth format H:mm:ss:SSS;
			SimpleDateFormat f6=new SimpleDateFormat(" H:mm:ss:SSS");
			String s6=f6.format(today);
			System.out.println("Format6=" +s6);
			
			//seventh formate k:mm a,z;
			SimpleDateFormat f7=new SimpleDateFormat("K:mm a,z");
			String s7=f7.format(today);
			System.out.println("Format7=" +s7);
			
			//eight formate yyyy.MMMMM.dd GGG hh:mm aaa 
			SimpleDateFormat f8=new SimpleDateFormat(" yyyy.MMMMM.dd GGG hh:mm aaa ");
			String s8=f8.format(today);
			System.out.println("Format6=" +s8);
				 				
}
}
