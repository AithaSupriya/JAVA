package com.anp6589;

public class ClassOperators {
	private int x=11,y=12;//instance variable
	public static int z=5;//static variable
	static void unary() {
		int a=15,b=20;
		System.out.println("unary operators:-");
		System.out.println("Pre increment: "+(++a)); 
		System.out.println("post increment: "+(a++)); 	
		System.out.println("Pre decrement: "+(--b)); 
		System.out.println("post decrement :"+(b--));
		System.out.println("-------------------------");

	}
	void arithmetic() {
		int x=25, y=75;//local variable
		System.out.println("Arthmetic operators:-");
		System.out.println("Addition: "+(x+y));
		System.out.println("Subtraction: "+(x-y));
		System.out.println("Multiplication: "+(x*y));
		System.out.println("Mod division: "+(x%y)); 
		System.out.println("Normal division: "+(x/y));
		System.out.println("-------------------------");
	}
	 void logical() {
		int x=2,y=5;
		System.out.println("Logical operators:-");
		System.out.println("Logical and: "+((x<y)&&(x<y)) );
		System.out.println("Logical or: "+((x>y)||(x>y)) );
		System.out.println("Logical not :"+((z)!=(y)) );
		System.out.println(z);
		System.out.println("-------------------------");
	}
	static void bitwise() {
		int x=5,y=7;
		System.out.println("Bitwise operators:-");
		System.out.println("Bitwise  or: "+((x)|(y)) );
		System.out.println("Bitwise  and: "+((x)&(y)) );
		System.out.println("Bitwise  xor :"+((x)^(y)) );
		System.out.println("Bitwise  rightshift :"+((x)>>(y)) );
		System.out.println("Bitwise  leftshift :"+((x)<<(y)) );
		System.out.println("-------------------------");
	}
	void assignment() {		
		System.out.println("Assignment operators:-");
		System.out.println("Addition: "+(x+=y));
		System.out.println("Subtraction: "+(x-=y));
		System.out.println("Multiplication: "+(x*=y));
		System.out.println("Mod division: "+(x%=y)); 
		System.out.println("Normal division: "+(x/=y));
		System.out.println("-------------------------");
	}
	static void relational() {
		int x=11, y=15;
		System.out.println("relational operators:-");
		System.out.println("greaterthan: "+(x>y));
		System.out.println("lessthan: "+(x<y));
		System.out.println("greaterthan equal to: "+(x>=y));
		System.out.println("lessthan equal to: "+(x<=y)); 
		System.out.println("equal:"+(x==y));
		System.out.println("-------------------------");
	}
	
public static void main(String[] args) {
	ClassOperators co=new ClassOperators();
	unary();
	co.arithmetic();
	co.logical() ;
	bitwise() ;
	co.assignment();
	relational();
}
}