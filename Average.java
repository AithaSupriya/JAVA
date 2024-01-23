package com.anp6589;
import java.util.Scanner;
public class Average {
	Scanner sc=new Scanner(System.in);
	void average() {
		System.out.println("Enter 1st value:");
		 int n1=sc.nextInt();
		System.out.println("Enter 2nd value:");
		 int n2=sc.nextInt();
		System.out.println("Enter 3rd value:");
		 int n3=sc.nextInt();
		System.out.println("Enter 4th value:");
		 int n4=sc.nextInt();
		System.out.println("Enter 5th value:");
		 int n5=sc.nextInt();
		 float res=(n1+n2+n3+n4+n5)/5;
		 System.out.println("Average:"+res);
		
	}
	String avg2() {
		String s="Calculation completed";
		return s;
	}
	public static void main(String[] args) {
		Average avg=new Average();
		avg.average();
		System.out.println(avg.avg2());
	}
}
