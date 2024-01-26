package Multilevelinheritance;
//Multilevelinheritance means derived class from the parent class 
//and also that derived class acts as a parent class for other classes
public class ClassA {
	void m1() {
		System.out.println("m1() method from Parent class classA");
	}
	public static void main(String[] args) {
		ClassA obj=new ClassA();//creating an obj
		obj.m1();//calling m1() method using obj reference
		}
}
/*
 o/p:m1() method from Parent class classA
 */
========================================================================
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
========================================================================
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
