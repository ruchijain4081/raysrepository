package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CallingPerson {
public static void main(String[] args) throws ParseException {
    Person p=new Person();
    Person p1 =new Person(); 
    p.setName("ruchi jain");
    p1.setName("rohan jain");
   
    SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yyyy");
    Date d= f1.parse("12/02/1993");
    Date d2=f1.parse("12/09/1991");
    
    p.setDateOfBirth(d); 
    p1.setDateOfBirth(d2); 
    
    p1.setAddress("jain mandir road, kalapipal");
    p.setAddress("madhumilan square");
    
    p.setAge(d);
    p1.setAge(d2);
    
    System.out.println("name="+p.getName()+"\t Name2="+p1.getName());
    
    System.out.println("address= "+p.getAddress()+"\t address2="+p1.getAddress());
    
    System.out.println("date of birth = "+p.getDateOfBirth()+"\t dob2="+p1.getDateOfBirth());
    System.out.println("age="+p.getAge()+" \t age2="+p1.getAge());
}
}
