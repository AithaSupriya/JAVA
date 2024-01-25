package com.anp6589;
import java.util.Scanner;
public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=sc.nextInt();
		if(x>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
	}
}
