package com.anp6589;

public class ClassTypecasting {
	static ClassTypecasting tc=new ClassTypecasting();
	
	static void implicitTypecasting() {
		System.out.println("Implict TypeCasting:");
		System.out.println("converting int to float");
		
		int x=10;
		float y=x;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("converting char to int");
		char a='Z';
		int b=a;
		System.out.println(a);
		System.out.println(b);
	}
	void explicitTypecasting() {
		System.out.println("===============================");
		System.out.println("Explict TypeCasting:");
		System.out.println("converting double to float");
		double m=10367.67834526;
		float n=(float)m;
		System.out.println(m);
		System.out.println(n);
		
		System.out.println("converting int to char");
		int i1=86;
		char c1= (char)i1;
		System.out.println(i1);
		System.out.println(c1);
	}
public static void main(String[] args) {
	tc.implicitTypecasting();
	tc.explicitTypecasting();
}
}
