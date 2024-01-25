package com.anp6589;

public class Constructor {
	void m1() {
		new Constructor(11,2,3);
	}
	Constructor(){
		System.out.println("Default constructor ");		
	}
	Constructor(int i,int j,int k){
		System.out.println("Parameterized constructor :"+(i+j*k));
	}
	
	public static void main(String args[]){ 		
		Constructor obj=new Constructor();
		obj.m1();
	}
}
