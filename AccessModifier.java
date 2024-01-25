package com.anp6589;

public class AccessModifier {
	int a=10,b=20,c=a+b;
	
	public void publicexample() {
		System.out.println("This is public method:");//public can be accessed to the other classes
		System.out.println(c);
	
	}
	private void privatexample() {
		System.out.println("This is private method:");//private can be accessed only within the same class
		System.out.println(c);
		publicexample();
	}
	void defaultexample() {
		System.out.println("This is default method");//default method can also be accessed to the aother classes
	}
	
	public static void main(String[] args) {
		AccessModifier AM=new AccessModifier();
		//AM.publicexample();
		AM.defaultexample();
		AM.privatexample();
		
		}
}

/*
o/p:This is default method
	This is private method:
	30
	This is public method:
	30

 */






