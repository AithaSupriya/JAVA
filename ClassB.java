package Multilevelinheritance;

public class ClassB extends ClassA{//extend keyword is used to inherit the other class properties
	void m2() {
		System.out.println("m2() method from child class ClassB");//this is a child class for classA
	}
	
	public static void main(String[] args) {
		ClassB obj=new ClassB();	
		obj.m1();//m1() method is called using classA 
		obj.m2();
	}
}
/*

o/p:m1() method from Parent class classA
	m2() method from child class ClassB

*/