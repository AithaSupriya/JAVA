package ExceptionHandling;
import java.util.Scanner;
public class SimpleCalculator {
	Scanner sc=new Scanner(System.in);
	void calculator() {
		
		try {
			System.err.println("Enter two numbers:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.err.println("Enter an operator:");
			String op=sc.next();
			if(op.equals("+")) {
				System.out.println(+(a+b));
			}
			else if(op.equals("-")) {
				System.out.println(+(a-b));
			}
			else if(op.equals("*")) {
				System.out.println(+(a*b));
			}
			else if(op.equals("/")) {
				System.out.println(+(a/b));
			}
			else {
				System.out.println("Invalid operator");
			}
			
		}
		catch (ArithmeticException e1) {
            System.out.println("Arithmetic error: " + e1.getMessage());
        } 
		catch (Exception e) {
            System.out.println("Error: ");
        } 
		finally {
            System.out.println("Calculation Completed");
            sc.close();
        }

	}
	
	public static void main(String[] args) {
		SimpleCalculator calculator=new SimpleCalculator();
		calculator.calculator();
	}
}
/*
o/p:Enter two numbers:
	2
	6
	Enter an operator:
	*
	12
	calculation Completed
 */




