package com.rays.oop;

import java.util.Calendar;
import java.util.Date;

public class Person {
	private String name=null;
	private Date dob;
	private String address=null;
    private int age=0;
   public void setName(String a) {
	   name=a;
   }
   public String getName() {
	   return name;
   }
   public void setDateOfBirth(Date d) {
	   dob=d;
   }
   public Date getDateOfBirth() {
	   return dob;
   }
   public void setAge(Date i) {
	   Date today=new Date();
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(i);
		
		int me=cal.get(Calendar.YEAR);
		
		Calendar current=Calendar.getInstance();
		
		current.setTime(today);
		 
		int t=current.get(Calendar.YEAR);
	   age=t-me;
   }
   public int getAge() {
	   return age;
   }
   public void setAddress(String ad) {
	   address=ad;
   }
   public String getAddress() {
	   return address;
   }
}
