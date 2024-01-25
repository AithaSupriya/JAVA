package com.anp6589;
import java.util.Scanner;
public class PatternPgm1 {
	Scanner sc=new Scanner(System.in);
	void pattern1() {
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            
            for(int k=1; k<=i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
           
            System.out.println();
        }
        
    }
	void pattern2() {
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            
            for(int k=1; k<=2*i-1; k++) {
                System.out.print("*");
            }
           
            System.out.println();
        }
        
    }
       
	public static void main(String[] args) {
		PatternPgm1 m1=new PatternPgm1();
		m1.pattern1();
		m1.pattern2();
	}
}
//i/p:Enter the Number: 
//5
/*o/p:
 	* 
   * * 
  * * * 
 * * * * 
* * * * * 
 
 */


/* i/p:Enter the Number: 
	   5
	o/p:    *
      	   ***
      	  *****
      	 *******
      	*********
*/
	
