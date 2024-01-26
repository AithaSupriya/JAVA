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
