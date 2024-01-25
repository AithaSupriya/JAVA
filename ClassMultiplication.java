package com.anp6589;

public class ClassMultiplication {
	public float multiplication() {
		float x=2.3f,y=1.4f;
		float f=x*y;
		return f;
	}
	public static void main(String[] args) {
		ClassMultiplication cm=new ClassMultiplication();
		float res;
		res=cm.multiplication();
		System.out.println("multiplication:"+String.format("%.2f", res));
	}

	
}
