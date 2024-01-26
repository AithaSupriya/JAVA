package MethodOverloading;

public class Car extends Vehicle{
	//constructor
	Car(String make, String model, int year, int maximumspeed) {
		super(make, model, year, maximumspeed);//super keyword is used to access the data member of parent class
	}
	@Override
	void drive() {
		//printing attributes
		System.out.println(make + " " +model + " Car is driving");
	}
	
}
