package MethodOverloading;

public class Vehicle {
		//attributes
		String make;
		String model;
		int year;
		int maximumspeed;
		//default constructor
		Vehicle(String make,String model,int year,int maximumspeed) {
			this.make = make;
		    this.model = model;
		    this.year = year;
	        this.maximumspeed = maximumspeed;
		}
		//drive() method
		void drive() {
			System.out.println("Vehicle is driving");
		}
		public static void main(String[] args) {
			//instantiation of bike and car class
			Vehicle car = new Car("Mercedes-Benz", "S-Class", 2024, 155);
	        car.drive();

	        Vehicle bike = new Bike("Yamaha", "YZF-R1", 2024, 186);
	        bike.drive();
	}

}
/*
 o/p:Mercedes-Benz S-Class Car is driving
	 Yamaha YZF-R1 Bike is driving
 
 */
===========================================================================================
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
===========================================================================================
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


