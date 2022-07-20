package com.rays.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;



public class Person {
	private String name=null;
	private Date dob;
	private String address=null;
   
   public void setName(String a) {
	   name=a;
   }
   public String getName() {
	   return name;
   }
   public void setDateOfBirth(String date) throws ParseException {
	   SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
	   Date d=f.parse(date);
	   dob=d;
   }
   public Date getDateOfBirth() {
	   return dob;
   }
  
   public void setAddress(String ad) {
	   address=ad;
   }
   public String getAddress() {
	   return address;
   }
}


