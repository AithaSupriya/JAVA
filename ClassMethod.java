package com.anp6589;

public class ClassMethod {
	String m1() {
		ClassMethod cm=new ClassMethod();
		System.out.println(cm.m2());
		String s="java";
		return s;
	}
	int m2() {
		ClassMethod cm=new ClassMethod();
		System.out.println(cm.m3());
		int i=10;
		return i;
	}
	float m3() {
		ClassMethod cm=new ClassMethod();
		System.out.println(cm.m4());
		float f=3.4f;
		return f;
		
	}
	String m4() {
		String s1="python";
		return s1;
	}
	public static void main(String[] args) {
		ClassMethod cm=new ClassMethod();
		System.out.println(cm.m1());
	}
}
