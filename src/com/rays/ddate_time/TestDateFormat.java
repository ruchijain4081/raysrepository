package com.rays.ddate_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
public static void main(String[] args) throws ParseException {
 Date d = new Date();
 SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
 String s=f.format(d);
 System.out.println("Date :"+s);
 String s1="07/07/2022 1:45:00";
 Date d1= f.parse(s1);
 System.out.println(d1);

}
}
