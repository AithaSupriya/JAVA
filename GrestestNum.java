package com.anp6589;

public class GrestestNum {
	void x1() {
		int a=80, b=15, c=40;
		//nested if-else to find the greatest number
		if(a>b) { 			
		 if(a>c) {
			System.out.println(a+" is greater");
		}
		else {
			System.out.println(c+" is greater");
		}
	}
		
		else{
			if(b>c) {
				System.out.println(b+" is greater");
		}
			else {
				System.out.println(c+" is greater");
			}
		}
	}
	void x2() {
		int a=80, b=15, c=40;
		
		//else if ladder to find the smallest number
		if(a<b && a<c) {
			System.out.println(a+" is smaller");
		}
		else if(b<a && b<c){
			System.out.println(b+" is smaller");
		}
		else{
			System.out.println(c+" is smaller");
		}
	}
	public static void main(String[] args) {
		GrestestNum gn=new GrestestNum();//creating an object
		gn.x1();//calling method x1
		gn.x2();//calling method x2
	}
	
}
//o/p:80 is graeter
//    15 is smaller
