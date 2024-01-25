package com.anp6589;

import java.util.Scanner;

public class ClassFrequency {
	static void  frequencyOfElements()
	{
		System.out.println("Enter size of an array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		int arr[]=new int[n];	
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter " +(i+1)+ "st element into array:");
			arr[i]=sc.nextInt();
		}	

		int max = Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] > max) 
                max = arr[i]; 
        } 
  
        int B[] = new int[max + 1]; 
        for (int i = 0; i < arr.length; i++) { 
            B[arr[i]]++; 
        } 
        for (int i = 0; i <= max; i++) { 
            if (B[i] >= 1) 
                System.out.println(i + "-" + B[i]); 
        }
	}
	public static void main(String[] args) {
		 frequencyOfElements();
	}
}

/*
i/p:
	Enter size of an array:
	10
	Enter 1st element into array:
	4
	Enter 2st element into array:
	6
	Enter 3st element into array:
	2
	Enter 4st element into array:
	1
	Enter 5st element into array:
	1
	Enter 6st element into array:
	2
	Enter 7st element into array:
	6
	Enter 8st element into array:
	4
	Enter 9st element into array:
	9
	Enter 10st element into array:
	2
o/p:
	1-2
	2-3
	4-2
	6-2
	9-1

 */


