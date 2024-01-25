package com.anp6589;

import java.util.Scanner;

public class Month {
	void x1() {
		Scanner sc=new Scanner(System.in);//take the input form the user
		String s=sc.next();// store string type of value
		//cases for identify the months
		switch(s) {
		case "jan":
			System.out.println("January is the 1st month in a year");
			break;
		case "feb":
			System.out.println("Febuary is the 2st month in a year");
			break;
		case "march":
			System.out.println("march is the 3st month in a year");
			break;
		case "april":
			System.out.println("April is the 4st month in a year");
			break;
		case "may":
			System.out.println("May is the 5st month in a year");
			break;
		case "june":
			System.out.println("June is the 6st month in a year");
			break;
		case "july":
			System.out.println("July is the 7st month in a year");
			break;
		case "aug":
			System.out.println("August is the 8st month in a year");
			break;
		case "sep":
			System.out.println("September is the 9st month in a year");
			break;
		case "oct":
			System.out.println("October is the 10st month in a year");
			break;
		case "nov":
			System.out.println("November is the 11st month in a year");
			break;
		case "dec":
			System.out.println("December is the 12st month in a year");
			break;
		default:
			System.out.println("Enter only months");
			break;
		
		}
	}

	public static void main(String[] args) {
		Month obj=new  Month();//Creating an object 
		obj.x1();//calling a method 
}
}

//i/p:nov
//o/p:November is the 11st month in a year

//i/p:hey
//o/p:Enter only months
