package com.anp6589;
import java.util.Scanner;
public class Factorial {
	void fact() {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		Factorial fc=new Factorial();//creating an obj
		fc.fact();//calling a method
	}
}
//i/p:Enter the number: 4
//0/p:24
