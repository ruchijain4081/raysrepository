
package com.rays.string;

public class MethodsOfStringBuffer {
public static void main(String[] args) {
	StringBuffer sb= new StringBuffer("vijay");
	System.out.println("length = "+sb.length());
	System.out.println("capacity = "+sb.capacity());
	System.out.println("char at 4th place="+sb.charAt(3));
	System.out.println("index of = "+sb.indexOf("jay"));
	System.out.println("append string= "+sb.append(" dinanath chauhan"));
	System.out.println("insert string = "+sb.insert(5,"sir"));
	System.out.println("delete string = "+sb.delete(14, 20));
	System.out.println("replace ="+sb.replace(2, 5, "dina"));
	System.out.println("revers = "+sb.reverse());
	}
}
