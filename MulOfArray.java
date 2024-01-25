package com.anp6589;

//import java.util.Arrays;
import java.util.Scanner;

public class MulOfArray {
	Scanner sc=new Scanner(System.in);

	void  mulofarr() {
		 Integer[][] arr1 = new Integer[3][3];
	        Integer[][] arr2 = new Integer[3][3];
	        Integer[][] arr = new Integer[3][3];

	        System.out.println("Enter the elements of the first  matrix:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	            	arr1[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("Enter the elements of the second  matrix:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	            	arr2[i][j] = sc.nextInt();
	            }
	        }
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	            	arr[i][j] = arr1[i][j] + arr2[i][j];
	            }
	        }
	        System.out.println("Sum of the two matrices is:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
}
	
	public static void main(String[] args) {
		MulOfArray obj=new MulOfArray();
		obj.mulofarr();
		
	}
	
	
/*
i/p:Enter the elements of the first 3x3 matrix:
	1 2 3
	
	4 5 6
	
	7 8 9
	
	Enter the elements of the second 3x3 matrix:
	2 3 4
	
	5 6 7
	
	1 2 3

0/p:Sum of the two matrices is:
	3 5 7 
	9 11 13 
	8 10 12 
*/
	 
}
