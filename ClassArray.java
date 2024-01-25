package com.anp6589;
import java.util.Arrays;
import java.util.Scanner;
public class ClassArray {
	void m1() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int row=sc.nextInt();	
		System.out.println("Enter number of coloumns:");
		int col=sc.nextInt();
		
		int arr[][]=new int[row][col];
		System.out.println(Arrays.deepToString(arr));
		System.out.println("Enter "+row*col+" values into 2d array");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {		
			arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Printing 2d array values using nested for loop");

		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {		
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		 ClassArray obj=new  ClassArray();
		 obj.m1();
	}
}

/*
i/p:Enter number of rows:
	2
	Enter number of rows:
	3
	[[0, 0, 0], [0, 0, 0]]
	Enter 6 values into 2d array
	1
	2
	3
	4
	5
	6
	Printing 2d array values using loops
	
o/p:1 2 3 
	4 5 6 
 */
















