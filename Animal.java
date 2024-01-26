package Multilevelinheritance;

public class Animal {
	void makesound() {
		System.out.println("The animal makes a sound:");
	}
	
	public static void main(String[] args) {
		Animal animal=new Animal();		
		Animal dog=new Dog();
		Animal cat=new Cat();
		
		animal.makesound();
		dog.makesound();
		cat.makesound();
		}
}
/*
o/p:The animal makes a sound:
	The Dog barks
	The Cat barks
*/
===============================================================
package Multilevelinheritance;

public class Dog extends Animal {
	@Override
	 void makesound(){
		System.out.println("The Dog barks");
	}
}
===============================================================
package Multilevelinheritance;

public class Cat extends Animal {
	@Override
	void makesound(){
		System.out.println("The Cat barks");
	}
}
