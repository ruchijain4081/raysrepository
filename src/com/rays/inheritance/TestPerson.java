package com.rays.inheritance;

import java.text.ParseException;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		Businessman b=new Businessman();
		b.setAddress("main road kpp");
		b.setName("manoj");
		b.setDateOfBirth("12/02/1993");
		b.setIncome(40000.00);
		Doctor doc=new Doctor();
		doc.setAddress("rajive choke");
		doc.setName("suresh");
		doc.setDateOfBirth("12/03/1987");
		doc.setRegistractionNo("1234567");
		Student s=new Student();
		s.setAddress("railway colony");
		s.setName("raja");
		s.setDateOfBirth("12/04/2001");
		s.setMarks(65);
		s.setRollNo("123");
		System.out.println(s.getName()+" = "+"roll no:"+s.getRollNo()+" dob: "+s.getDateOfBirth()+" address: "+s.getAddress()+" marks:"+s.getMarks());
        System.out.println(b.getName()+" address: "+b.getAddress()+" dob: "+b.getDateOfBirth()+" income: "+b.getIncome());
	System.out.println(doc.getName()+" address : "+doc.getAddress()+"registration id : "+doc.getRegistractionNo()+"dob : "+doc.getDateOfBirth());
	}
	

}
