package com.rays.inherritence;

public class TastShape {
public static void main(String[] args) {
      Shape s=new Shape();
      s.area();
      Triangle t=new Triangle();
      t.area();
      Shape s1=new Triangle();
      s1.area();
      Shape[]sa=new Shape[3];
      sa[0]=new Rectangle();
      sa[1]=new Circle();
      sa[2]=new Triangle();
      Rectangle r=(Rectangle)sa[0];
      r.setLength(10);
      r.setWidth(12);
    // r.area(); 
      Circle c=(Circle)sa[1];
      c.setRadius(10);
      //c.area();
    Triangle t1=(Triangle)sa[2];
      t1.setBase(14);
      t1.setHight(10);
      //t1.area();
      double x=0;
  for(int i=0;i<sa.length;i++) {
	  x+=sa[i].area();
  }
  System.out.println("total area is ="+x);
}
}
