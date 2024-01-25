package com.anp6589;

import java.util.Scanner;

public class CountingNum {
	void count() {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);//take an input from user
		int n=sc.nextInt();
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		CountingNum cn=new CountingNum();//creating an obj
		cn.count();//calling method
	}
}
//i/p:76589
//o/p:5