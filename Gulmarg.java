package MethodOverloading;

public class Gulmarg extends HillStations {
	@Override
	void location() {
		System.out.println("The location is Gulmarg");
	}
	@Override
	void famousFor() {
		System.out.println("Gulmarg is famous for its skiing");
		System.out.println("==========================================");

	}
	public static void main(String[] args) {
		 HillStations m1=new Gulmarg();
		 m1.location();
		 m1.famousFor();
	}
}
/*
o/p:The location is Gulmarg
	Gulmarg is famous for its skiing
*/