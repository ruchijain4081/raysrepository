package com.rays.ddate_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculateAge {
	
	public static void main(String[] args) throws ParseException {
		Date today=new Date();
		
		SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yyyy");
		Date my=f1.parse("12/02/1965");
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(my);
		
		int me=cal.get(Calendar.YEAR);
		
		Calendar current=Calendar.getInstance();
		
		current.setTime(today);
		 
		int t=current.get(Calendar.YEAR);
		
		System.out.println(t-me);
		

	}
}
