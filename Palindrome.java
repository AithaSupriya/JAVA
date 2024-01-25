package com.anp6589;

import java.util.Scanner;

public class Palindrome {
//palindrome is a number where actual string is equal to reverse of a string
	Scanner sc=new Scanner(System.in);//take an input from user
	void number() {
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int res,rem=0,temp=n;
		while(n>0) {
			res=n%10;//perform modules operation and store the number
			rem=rem*10+res;//reverse the number
			n=n/10;//divide the number by 10 and store the value
		}
		//checking if the given number is palindrome or not 
		if(temp==rem) {
			System.out.println(temp+" is a palindrome number");
		}
		else {
			System.out.println(temp+" is not a palindrome number");
		}
	}
	public static void main(String[] args) {
		Palindrome obj=new Palindrome();
		obj.number();
	}
}

//i/p:Enter the number:
//1221
//0/p:1221 is a palindrome number

//i/p:Enter the number:
//1234
//o/p:1234 is not a palindrome number