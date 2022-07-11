package com.rays.ddate_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Question3 { 
	
public static void main(String[] args) throws ParseException { 
	
     SimpleDateFormat  str=new SimpleDateFormat("dd/MM/yy");
     SimpleDateFormat end=new SimpleDateFormat("dd/MM/yy");
     
     Date startdate= str.parse(args[0]);
     Date enddate=end.parse(args[1]);
     
     if(enddate.compareTo(startdate)==-1) {
    
    	 System.err.println("error  : The date you insert might be wrong");
   }
     else {
    	 
    	 System.out.println("your date is correct");
     }
     
     //by before and after method
     
     if (enddate.after(startdate)) {
    	 System.out.println("your date is correct");
     }
     else {
    	 if(enddate.before(startdate)) {
    		 System.err.println("your date is wrong");
    	 }
        }
}
}

