package MethodOverloading;
//MethodOverriding means two or more methods in 2 diff classes having same method name,parameters and same return type
public class HillStations {
	void location() {
		System.out.println("The location is HillStations");
	}
	void famousFor() {
		System.out.println("HillStations is famous for its greenery");
		System.out.println("==========================================");
	}
	public static void main(String[] args) {
		 HillStations m1=new  HillStations();
		 m1.location();
		 m1.famousFor();
		 m1=new Manali();
		 m1.location();
		 m1.famousFor();
		 m1=new Mussoorie();
		 m1.location();
		 m1.famousFor();
		 m1=new Gulmarg();
		 m1.location();
		 m1.famousFor();		 
	}
}
/*
o/p:The location is HillStations
HillStations is famous for its greenery
==========================================
The location is Manali
Manali is famous for its trekking
==========================================
The location is Mussoorie
Mussoorie is famous for its camel's Back Road
==========================================
The location is Gulmarg
Gulmarg is famous for its skiing
==========================================
*/