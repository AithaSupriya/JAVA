package com.anp6589;

public class AccessModifiers2 {
	public static void main(String[] args) {
		AccessModifier AM=new AccessModifier();
		AM.publicexample();//this method can be called 
		//AM.privatexample(); //this cannot be called bcoz private modifier won't give access to the other classes 
		AM.defaultexample();//this method can be called
	}
}

/*
o/p:This is public method:
	30
	This is default method


*/