package ExceptionHandling;
import java.util.Scanner;

public class ConversionException {
	Scanner sc=new Scanner(System.in);
	void UserInput() {
		//user input
		try {
			System.out.println("Enter the number:");
			String n=sc.next();
			//converting the string to an integer
			int ConvertedNo=Integer.parseInt(n);
			System.out.println("The number you entered is:"  +ConvertedNo);
		}
		//handling exceptions
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException Exception occoured: "+e.getMessage());
		}
		catch(NullPointerException e1) {
			System.out.println("NullPointerException Exception occoured: "+e1.getMessage());

		}
		finally {
			System.out.println("Completed");
		}
	}
	public static void main(String[] args) {
		ConversionException exception=new ConversionException();
		exception.UserInput();
	}
}

/*
o/p:Enter the number:
	4
	The number you entered is:4
	Completed
	
	Enter the number:
	a
	NumberFormatException Exception occoured: For input string: "a"
	Completed
*/