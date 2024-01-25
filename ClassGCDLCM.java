package com.anp6589;
import java.util.Scanner;
public class ClassGCDLCM {
	Scanner sc=new Scanner(System.in);
	public int findGCD(int a,int b) {
		while(b>0) {

            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
	}
	 public int findLCM(){
		 System.out.print("Enter first number for LCM: ");
	     int p = sc.nextInt();
	     System.out.print("Enter second number for LCM: ");
	     int q = sc.nextInt();
	     
		 return p * q / findGCD(p,q);
	}
		public static void main(String[] args) {
		ClassGCDLCM obj=new ClassGCDLCM();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number for GCD: ");
        int a = sc.nextInt();
        System.out.print("Enter second number for GCD: ");
        int b = sc.nextInt(); 
		int res=obj.findGCD(a,b);
		System.out.println("GCD Output: " + res);
		int res1=obj.findLCM();
		System.out.println("LCM Output: " + res1);
	}
}


/*Enter first number for GCD: 60
Enter second number for GCD: 36
GCD Output: 12
Enter first number for LCM: 12
Enter second number for LCM: 9
LCM Output: 36

 */
 */

