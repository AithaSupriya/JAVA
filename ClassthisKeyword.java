package com.anp6589;

public class ClassthisKeyword {
	 int a=10;   //instance variable
     static int b=40; //static variable
     
     int p,q;  //two instance variables
     
     void k2()
     {
    	System.out.println("m2() non-static method  is called using this keyword"); 
     }
     static void k3()
     {
    	 System.out.println("m3() static method  is called using this keyword"); 
     }
     void keyword()
     {
    	 
    	 System.out.println("In Keyword() method");
    	 int a=20;   //local variable
    	 System.out.println("a="+a);
    	 System.out.println("a="+this.a); 
    	 System.out.println("b="+this.b);
    	 this.k2();
    	 this.k3();
    	 System.out.println("In static method we cannot use this keyword");
    	 //this.m5();  //cannot call methods which belong to outside the class
     }
     ClassthisKeyword(String s)
     {

    	 System.out.println("Parameterized constructor:"+s);
     }
     ClassthisKeyword()
     {
    	 this(100,200); //1st statement only once from the constructor
    	 System.out.println("default constructor"); 
     }
     
     ClassthisKeyword(int p,int q)
     {
    	 System.out.println(this.p=p);
    	 System.out.println(this.q=q); 
     }

    
	public static void main(String[] args) {
		 ClassthisKeyword obj=new  ClassthisKeyword("Hello");
		 obj.keyword();

}
}

/*
o/p:100
	200
	Parameterized constructor:Hello
	In Keyword() method
	a=20
	a=10
	b=40
	m2() non-static method  is called using this keyword
	m3() static method  is called using this keyword
	In static method we cannot use this keyword
 */








