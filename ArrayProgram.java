package com.anp6589;
import java.util.Scanner;

public class ArrayProgram {

	void sum() {
		System.out.println("Enter size of an array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter values: ");
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for (int i=0;i<n;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println("sum:" +sum);
		int avg=sum/n;
		System.out.println("avg:" +avg);
		
	}
	public static void main(String[] args) {
	ArrayProgram a=new  ArrayProgram ();
	a.sum();
}
}

/* i/p: Enter size of an array:
		3
		Enter values: 
		10
		Enter values: 
		20
		Enter values: 
		30
   o/p: sum:60
		avg:20
*/









