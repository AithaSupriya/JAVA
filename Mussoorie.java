package MethodOverloading;

public class Mussoorie extends HillStations {
	@Override
	void location() {
		System.out.println("The location is Mussoorie");
	}
	@Override
	void famousFor() {
		System.out.println("Mussoorie is famous for its camel's Back Road");
		System.out.println("==========================================");

	}
	public static void main(String[] args) {
		HillStations m1=new Mussoorie();
		 m1.location();
		 m1.famousFor();
	}
}
/*
o/p:The location is Mussoorie
	Mussoorie is famous for its camel's Back Road
*/