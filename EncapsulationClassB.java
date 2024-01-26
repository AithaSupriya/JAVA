package encapsulation;

public class EncapsulationClassB {
	void m1() {
		//here we use EncapsulationClassA to get access for the variables and methods which are declared
		EncapsulationClassA obj=new EncapsulationClassA();
		obj.setUserName("Supriya");//modify the value 
		obj.setUserAge(21);
		obj.setUserPhno(8935460781L);//L is a literal value should be treated as a long
		System.out.println("UserName: "+ obj.getUserName());//read the value
		System.out.println("UserAge: "+ obj.getUserAge());
		System.out.println("UserPhno: "+ obj.getUserPhno());
	}
	public static void main(String[] args) {
		EncapsulationClassB obj=new EncapsulationClassB();
		obj.m1();
	}
}
/*
0/p:
	UserName: Supriya
	UserAge: 21
	UserPhno: 8935460781

*/