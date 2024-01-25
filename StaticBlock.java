package com.anp6589;

public class StaticBlock {
	static {
		System.out.println("This is static block");//this block is executed when the class is loaded
	}
	static void m1() {
		System.out.println("This is m1() method block");//since we used static keyword even without obj reference
														//this can be call this method
	}
	void m2() {
		final int a=20;//final keyword
		System.out.println(a);	//this will never print bcoz it is not called 
								//even if we call we need to create an obj referene for it
	}
	public static void main(String[] args) {
		m1();
	}
}

/*
 * o/p: This is static block
		This is m1() method block
 */

