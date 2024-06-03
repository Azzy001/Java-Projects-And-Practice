import java.util.Scanner;

/**
 * ATM_Two class provides basic ATM functionalities like balance check, deposit,
 * and withdrawal.
 */
public class ATM_Two {
    private double balance;

    // Constructor to initialize the ATM with a starting balance
    public ATM_Two(double balance) {
        this.balance = balance;
    }

    // Method to get the current balance
    public double getBalance() {
        return this.balance;
    }

    // Method to withdraw an amount from the balance
    public void withdrawal(double amount) {
        // Check if the withdrawal amount is valid and if there are sufficient funds
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("New balance: " + this.balance);
        } else {
            System.out.println("Withdrawal failed.");
        }
    }

    // Method to deposit an amount to the balance
    public void deposit(double amount) {
        // Check if the deposit amount is valid
        if (amount > 0) {
            this.balance += amount;
            System.out.println("New balance: " + this.balance);
        } else {
            System.out.println("Deposit failed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a Scanner object for user input
        ATM_Two atm = new ATM_Two(100);
        // Initialize ATM with a balance of 100

        boolean access = true;
        // Variable to control the ATM loop
        while (access) {
            // Display menu options
            System.out.println("\nSelect options:\n" +
                    "1. View balance\n" +
                    "2. Withdraw\n" +
                    "3. Deposit\n" +
                    "4. Exit system");
            int choice = scanner.nextInt();
            // Get user's choice
            scanner.nextLine();
            // Consume newline left-over

            // Handle user's choice
            if (choice == 1) {
                // Display current balance
                System.out.println("Current balance: " + atm.getBalance());
            } else if (choice == 2) {
                // Process withdrawal
                System.out.println("Withdrawal amount: ");
                double withdraw = scanner.nextDouble();
                scanner.nextLine();
                // Consume newline left-over
                atm.withdrawal(withdraw);
            } else if (choice == 3) {
                // Process deposit
                System.out.println("Deposit amount: ");
                double deposit = scanner.nextDouble();
                scanner.nextLine();
                // Consume newline left-over
                atm.deposit(deposit);
            } else if (choice == 4) {
                // Exit the system
                System.out.println("Exiting system.\nGoodbye.");
                access = false;
                // Set access to false to exit the loop
            } else {
                // Handle invalid option
                System.out.println("Invalid option.");
            }
        }

        scanner.close();
        // Close the scanner outside the loop
    }
}
