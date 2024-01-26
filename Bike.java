package MethodOverloading;

public class Bike extends Vehicle{
	//constructor
	Bike(String make, String model, int year, int maximumspeed) {
		super(make, model, year, maximumspeed);
	}
	
	@Override
	void drive() {
		//printing attributes
		System.out.println(make + " " + model + " Bike is driving" );
		}
	
}
