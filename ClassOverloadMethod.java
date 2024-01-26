package MethodOverloading;
//MethodOverloading means a class having same method name but different parameters 
public class ClassOverloadMethod {
	//method having 1 parameter
	void area(int a) {
		double areaofcircle=3.14*a*a;//formulae=pi(r)2
		System.out.println("The area of circle with radius "+a+" is: "+areaofcircle);
	}
	//Having same method name but 2 parameters i.e. method overloading
	void area(double b,double h) {
		double areaoftriangle=0.5*b*h;//formulae=1/2.b.h
		System.out.println("The area of triangle with breadth "+b+" and height "+h+" is: "+areaoftriangle);

	}
	void area(int l, int b) {
		int areaofrectangle=l*b;//formulae=l.b
		System.out.println("The area of rectangle with length "+l+" and breadth "+b+" is: "+areaofrectangle);

	}
	public static void main(String[] args) {
		ClassOverloadMethod m1=new ClassOverloadMethod();
		m1.area(5);
		m1.area(15.0,12.0);
		m1.area(8,10);
	}
}
/*
o/p:The area of circle with radius 5 is: 78.5
	The area of triangle with breadth 15.0 and height 12.0 is: 90.0
	The area of rectangle with length 8 and breadth 10 is: 80

*/