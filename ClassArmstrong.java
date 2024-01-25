package com.anp6589;
import java.util.Scanner;
public class ClassArmstrong {
	static void armstrongNumber(int n1) {
		int temp=n1,sum=0,n=0,rem;
		while(temp != 0) {
            temp /= 10;
            n++;
        }
		temp=n1;
		while(temp!=0) {
			rem=temp%10;
			sum+=Math.pow(rem, n);
			temp/=10;
		}
		if(sum==n1) {
			System.out.println("It is a Armstrong number ");
		}
		else {
			System.out.println("It is not a Armstrong number ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n1=sc.nextInt();	
		armstrongNumber(n1);
	}
}

/*
Enter n value: 
1634
It is a Armstrong number 

 */


