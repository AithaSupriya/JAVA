package com.anp6589;
import java.util.Scanner;
public class LeapYear {
	
	void m1() {
		System.out.println("Enter the year:");
		
		Scanner sc=new Scanner(System.in);//take the input from the user
		int i=sc.nextInt();//storing int type of value2009
		
		//if i is divisible by 4,100 or by 400 then it is leap year 
		//else not a leap year 
		if((i%4==0 && i%100!=0)||(i%400==0)){
			System.out.println(i+" is a Leap year");
		}
		else {
			System.out.println(i+" is not a Leap year");
		}
	}
	
	public static void main(String[] args) {
		LeapYear ly=new LeapYear();//creating an obj
		ly.m1();//calling a method m1
	}
}
//i/p:Enter the year:2004
//0/p:2004 is a Leap year

//i/p:Enter the year:2009
//o/p:2009 is not a Leap year

