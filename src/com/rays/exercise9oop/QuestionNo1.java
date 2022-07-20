package com.rays.exercise9oop;
 


public class QuestionNo1 {
	public static void main(String[] args) {
		 Shape[]s=new Shape[3];
		totalArea(s);
	}
	
public static void totalArea(Shape[]sa) {

      sa[0]=new Rectangle();
      sa[1]=new Circle();
      sa[2]=new Triangle();
      Rectangle r=(Rectangle)sa[0];
      r.setLength(10);
      r.setWidth(12);
    
      Circle c=(Circle)sa[1];
      c.setRadius(10);
     
    Triangle t1=(Triangle)sa[2];
      t1.setBase(14);
      t1.setHight(10);
      
      double x=0;
  for(int i=0;i<sa.length;i++) {
	  x+=sa[i].area();
  }
  System.out.println("total area is ="+x);
}
}


