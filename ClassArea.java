package com.anp6589;

public class ClassArea {
	
	void areaofcircle() {
		double r=7;
		double area=(22*r*r)/7;
		System.out.println("area of circle:"+area);
	}
	void areaofsquare() {
		double s=20;
		System.out.println("area of square:"+s*s);
		System.out.println("Perimeter of a square:"+4*s);
	}
	void areaofrectangle() {
		double l=8;
		double b=20;
		double res=l*b;
		System.out.println("area of rectangle:"+res);
		System.out.println("Perimeter of rectangle:"+2*res);
	}
	public static void main(String[] args) {
		ClassArea ca=new ClassArea();
		ca.areaofcircle();
		ca.areaofsquare();
		ca.areaofrectangle();
		
		
		
	}
}

