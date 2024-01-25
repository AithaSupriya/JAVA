package com.anp6589;
import java.util.Scanner;
public class Vowel {
	Scanner sc = new Scanner(System.in);
	void m1() {
		 System.out.println("Enter a character: ");
	     char ch = sc.next().charAt(0);
	     if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
	    	  System.out.println(ch + " is a Vowel");
	        } else {
	          System.out.println(ch + " is a Consonant");
	     }
	}
	public static void main(String[] args) {
	Vowel V=new Vowel();
	V.m1();
}
}
/*i/p:Enter a character: 
	I
  o/p:I is a Vowel
  
  i/p:Enter a character: 
	s
  o/p:s is a Consonant
*/



