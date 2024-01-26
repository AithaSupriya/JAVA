package MethodOverloading;
//extends keyword is used for Class extending another class
public class Manali extends HillStations {
	@Override//this annotations indicates that these methods are overriding methods of superclass
	void location() {
		System.out.println("The location is Manali");
	}
	@Override
	void famousFor() {
		System.out.println("Manali is famous for its trekking");
		System.out.println("==========================================");

	}
	public static void main(String[] args) {
		HillStations m1=new Manali();
		 m1.location();
		 m1.famousFor();
	}
}
/*
o/p:The location is Manali
	Manali is famous for its trekking
*/