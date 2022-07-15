package com.rays.oop;

public class TestShape {
public static void main(String[] args) {
  Shape s=new Shape("red",10);
 System.out.println(s.getBorderWidth()+"  "+s.getColor());
  Shape s1=new Shape();
  s1.setColor("blue");
  s1.setBorderWidth(12);
   System.out.println(s1.getBorderWidth()+"  "+s1.getColor());
   
         Triangle t =new Triangle(5 ,8);
		System.out.println("area= "+t.area()+" perimeter= "+t.perimeter(12.0, 10, 30));
		
		Rectangle r=new Rectangle(10,20);
        System.out.println("area= "+r.area()+" perimeter= "+r.perimeter());
        
        Circle c=new Circle(12);
        System.out.println("area= "+c.area()+" perimeter= "+c.perimeter());
        Shape []sa=new Shape[3];
        		sa[0]  =new Rectangle(3,5);
        		sa[1]=new Circle(5);
        		sa[2]=new Triangle(5 ,8);
        		double x=0;
        		for(int i=0;i<sa.length;i++) {
        			 x += sa[i].area();
        			
        		}
        		System.out.println("sum of areas= "+x);
        		
 
 
}
}
