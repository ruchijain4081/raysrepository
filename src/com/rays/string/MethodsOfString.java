package com.rays.string;

public class MethodsOfString {
	public static void main(String[] args) {
		String s="vijay dinanath chauhan";
		//length method;
		System.out.println("String length = "+s.length() );
		//by place value find charactor;
		System.out.println("char at 8th position = "+s.charAt(7));
		//find the index of substring;
		System.out.println("nath index is = "+s.indexOf("nath"));
		// find the first position of one charactor;
		System.out.println("first positionof of a= "+s.indexOf('a'));
		//find the last position of one charactor;
	   System.out.println("last position of a= "+s.lastIndexOf('a'));
	   //replace a charactor by another charactor only for first charactor;
	   System.out.println("replace a by b = "+s.replace("a", "b"));
	 //replace a charactor by another charactor  for full string charactor;
	   System.out.println("replace all a by b = "+s.replaceAll("a", "b"));
	   //covert small laters to capital 
	   System.out.println(" small to capital = "+s.toUpperCase());
	//convert all capital laters to small;
	   System.out.println("capital to small = "+s.toLowerCase());
	   // start with given  string;
	   System.out.println("start with nath ="+s.startsWith("v"));
	   // end  with given  string;
	   System.out.println("end with dina ="+s.endsWith("n"));
	   //creat substring;
	   System.out.println("substring ="+s.substring(8, 20));
	   //split a string;
	   String [] s1=s.split(" ");
	   for(String d:s1)
	   System.out.println("split a string= "+d);
	   //trim a string.
	   System.out.println("trim = "+s.trim());
	   //concat a string with another;
	   System.out.println("concat = "+(s =s.concat(" uncle")));
	   
	}
	

}
