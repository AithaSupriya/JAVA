package com.anp6589;

import java.util.Scanner;

public class ClassPatterns {
	void starPattern() {
		System.out.println("Enter the odd number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j||(j==n-1-i)||i==n/2||j==n/2) {
					 System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		
	}
	void diamondPattern() {
		System.out.println("Enter n2 value:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		
		for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n - i; j++) {
	            System.out.print(" ");
	        }
	        for (int k = 0; k < (2 * i + 1); k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
		 for (int i = n - 2; i >= 0; i--) {
		      for (int j = 0; j < n - i; j++) {
		           System.out.print(" ");
		      }
		      for (int k = 0; k < (2 * i + 1); k++) {
		           System.out.print("*");
		      }
		      System.out.println();
		    }
	}
	public static void main(String[] args) {
		ClassPatterns obj=new ClassPatterns();
		obj.starPattern();
		obj.diamondPattern();
}
}

/* 
i/p:Enter the odd number:
    5
*   *   * 
  * * *   
* * * * * 
  * * *   
*   *   * 
Enter n2 value:
4
    *
   ***
  *****
 *******
  *****
   ***
    *

*/


