package com.anp6589;
import java.util.Scanner;

public class UserInputClass {
	
	void addition()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		System.out.println("Enter b value:");
		int b=sc.nextInt();
		System.out.println("Addition of " +a+ " and " +b+ " is "+(a+b));   
		    
	}
	void multiplication()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
	    double a=sc.nextDouble();
	    System.out.println("Enter b value:");
	    double b=sc.nextDouble();
	    System.out.println("Multiplication of "+a+" and " +b+ " is "+(a*b));
	}
	static void division()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		byte a=sc.nextByte();
	    System.out.println("Enter b value:");
	    byte b=sc.nextByte();
	    System.out.println("Division of " +a+ " and " +b+ " is "+(a/b));
	}
	public static void main(String[] args) 
	{
		UserInputClass ui=new UserInputClass();
		ui.addition();
		ui.multiplication();
		division();
		
	}
}


