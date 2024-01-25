package com.anp6589;

import java.util.Scanner;

public class Concatenation {
	
	void a1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string:");
		String s1=sc.next();
		System.out.println("Enter the 2st string:");
		String s2=sc.next();
		System.out.println("Concatenation of 2 strings: "+s1+" "+s2);
	}
	public static void main(String[] args) {
		Concatenation ca=new Concatenation();
		ca.a1();
	}
}
