package com.rays.basics;

public class MethodWithArrayParameter {
	public static void main(String[] args) {
		int [] number= {1,6,4,8,0,3,12,23};
		maxValue(number);
	}
  public static void maxValue(int[] num){
    	int x=0;
		int y=num[0];
		for (int i=0;i<num.length;i++) {
			if(y<x) {
				y=x;
			}
			else {
				if(y>x&&y<num[i]) {
					x=y;
					y=num[i];
				}
			}
		}
		System.out.println(y);

    	}
    }
