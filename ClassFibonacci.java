package com.anp6589;
import java.util.Scanner;

public class ClassFibonacci {
	
	public int nthFibonacciTerm(int n) {
		int a=0,b=1,x=a+b;
		if(n==0||n==1) {
			return 0;
		}
			else if(n==2){
				return 1;
			}
			else {
				for(int i=3;i<=n;i++) {
					x=a+b;
					a=b;
					b=x;
				}
				return x;
			}
	}
	public static void main(String[] args) {
		ClassFibonacci c=new ClassFibonacci();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int res=c.nthFibonacciTerm(n);		
		System.out.println(n+"th fibonacci term is: "+res);				

	}
}
/*i/p:Enter n value: 
	5
o/p:5th fibonacci term is: 3

 i/p:Enter n value: 
	1
o/p:5th fibonacci term is: 0 */




