package com.anp6589;
import java.util.Scanner;
public class Ascending {
	void m1() {
		System.out.println("Enter size of an array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Ener values: ");
			arr[i]=sc.nextInt();
		}
		 for (int i=0; i < n-1; i++) {     
	     for (int j =0; j < n-i-1; j++) {   
	    	 if(arr[j]>arr[j+1]) {
				int x=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=x;
	    	 }
		}
		}
		 for (int i = 0; i < n; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
		}
	public static void main(String[] args) {
	
		Ascending obj=new Ascending();
		obj.m1();
	
}
	
}

/*i/p:  Enter size of an array:
		3
		Enter values: 
		5
		Enter values: 
		3
		Enter values: 
		1
		
  o/p:	1 3 5 
*/
