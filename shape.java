package Multilevelinheritance;
//abstract class is a class which is declared with the help of abstract keyword 
abstract class shape {
	//abstract method
	abstract double calculateArea();
	
	public static void main(String[] args) {
		//instantiation
		Circle circle=new Circle(5.0);
		Rectangle rectangle=new Rectangle(30,20);

		System.out.println("Area of Circle: " + circle.calculateArea());
	    System.out.println("Area of Rectangle: " + rectangle.calculateArea());
	}
	
	}

/*
o/p:Area of Circle: 78.5
	Area of Rectangle: 600.0
*/

================================================================================
package Multilevelinheritance;

public class Circle extends shape {
	double radius;

	//constructor
	Circle(double radius){
		this.radius=radius;
	}
	//implementation
	@Override
	double calculateArea() {
		return 3.14*radius*radius;
	}
	
	
}
================================================================================
package Multilevelinheritance;

public class Rectangle extends shape {
	double l;
	double w;
	//constructor
	Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }
	//implementation
	@Override
	double calculateArea() {
		return l*w;
	}

}
