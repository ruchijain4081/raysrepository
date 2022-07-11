package com.rays.ddate_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Question2 {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
		Date install = f1.parse("12/07/2022");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(install);
		
		for (int i = 1; i <= 12; i++) {

			cal.add(Calendar.DATE, 30);
			System.out.println(cal.getTime());
		}
	}
}
