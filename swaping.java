package com.anp6589;

public class swaping {
  
	void type1(){		
		int a=10, b=20,temp;
		System.out.println("By using third variable:");
		System.out.println("Before swaping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swaping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		}
	void type2() {
		int a=10, b=20;
		System.out.println("By using +,-:");
		System.out.println("Before swaping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping:");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}
	void type3() {
		int a=10, b=20;
		System.out.println("By using *,%:");
		System.out.println("Before swaping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swaping:");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}
	public static void main(String[] args) {
		swaping sw=new swaping();
		sw.type1();
		sw.type2();
		sw.type3();
	}
}
