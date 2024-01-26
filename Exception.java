package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	Scanner sc=new Scanner(System.in);
	void m1() {
		//user input
		try {
			System.out.println("Enter the number:");
			int n=sc.nextInt();
			System.out.println("The number you entered is:"  +n);
		}
		//handling Exception
		catch (InputMismatchException e) {
            System.out.println("Enter a valid integer.");
		}
		finally {
			System.out.println("Thankyou");
		}
	}
	
	public static void main(String[] args) {
		 Exception obj=new  Exception();
		 obj.m1();
	}
}

/*
o/p:Enter the number:
	a
	Enter a valid integer.
	Thankyou
	
	Enter the number:
	8
	The number you entered is:8
	Thankyou
	

 * 
 */

