package ExceptionHandling;
import java.util.Scanner;
public class BankApplication {
	

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create a BankAccount with an initial balance of $1000
	        BankingAccount account = new BankingAccount(1000);

	        // Perform operations
	        System.out.println("Initial balance: $" + account.getBalance());

	        System.out.print("Enter the amount to deposit: $");
	        double depositAmount = scanner.nextDouble();
	        account.deposit(depositAmount);

	        System.out.print("Enter the amount to withdraw: $");
	        double withdrawAmount = scanner.nextDouble();
	        account.withdraw(withdrawAmount);

	        // Close the scanner
	        scanner.close();
	    }
	
}

