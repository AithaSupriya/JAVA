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
