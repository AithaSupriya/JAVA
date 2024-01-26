package Multilevelinheritance;

public class ClassC extends ClassB{
	void m3() {
		System.out.println("m3() method from grandchild class classC");//this is a grandchild class for classB
	}
	
	public static void main(String[] args) {
		ClassC obj=new ClassC();
		obj.m1();//classB has m2() method and it calso has classA properties so m1() will be called
		obj.m2();//m2() method is called using classB
		obj.m3();
	}
}
/*

o/p:m1() method from Parent class classA
	m2() method from child class ClassB
	m3() method from grandchild class classC

*/