package ExceptionHandling;

public class BankingAccount {

		private double balance;

	    // Constructor
	    public BankingAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposit successful. Current balance: " + balance);
	    }

	    // Method to withdraw money with exception handling
	    public void withdraw(double amount) {
	        try {
	            if (amount > balance) {
	                throw new IllegalArgumentException("Insufficient funds. Withdrawal amount exceeds balance.");
	            }

	            balance -= amount;
	            System.out.println("Withdrawal successful. Current balance: " + balance);

	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	}
//===========================================================================================package ExceptionHandling;
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

/*
 * o/p: Initial balance: $1000.0
		Enter the amount to deposit: $800
		Deposit successful. Current balance: 1800.0
		Enter the amount to withdraw: $1900
		Error: Insufficient funds. Withdrawal amount exceeds balance.
 */
