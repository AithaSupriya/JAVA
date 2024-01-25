package com.anp6589;
import java.util.Scanner;
public class Class2dArray {
	Scanner sc=new Scanner(System.in);
	void swapDiagonals(){
		System.out.println("Enter row size:");
		int row=sc.nextInt();
		System.out.println("Enter column size:");
		int col=sc.nextInt();
		
		int arr[][]=new int[row][col];
		System.out.println("Enter 9 elements into 2-d array:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {		
			arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {		
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		for (int i = 0; i < row; i++) {
            int temp = arr[i][i];
            arr[i][i] = arr[i][row - 1 - i];
            arr[i][row - 1 - i] = temp;
			
		} 
		
		System.out.println("After swapping diagonals:");
		for (int i = 0; i < row; i++) {
		    for (int j = 0; j < col; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
	}
public static void main(String[] args) {
	Class2dArray obj=new Class2dArray();
	
	obj.swapDiagonals();
}
}

/*
   i/p: Enter row size:
		3
		Enter column size:
		3
		Enter 9 elements into 2-d array:
		1
		2
		3
		4
		5
		6
		7
		8
		9
		1 2 3 
		4 5 6 
		7 8 9 
   o/p: After swapping diagonals:
		3 2 1 
		4 5 6 
		9 8 7 

 */













