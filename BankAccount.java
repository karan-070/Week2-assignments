// Define a class named BankAccount
public class BankAccount {
    // Private instance variable to store the balance of the account
    private int balance;

    // Constructor to initialize the balance with the provided value
    public BankAccount(int n) {
        this.balance = n;
    }

    // Public method to retrieve the current balance of the account
    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Create an instance of BankAccount named account1 with an initial balance of 1000
        BankAccount account1 = new BankAccount(1000);
        // Create another instance of BankAccount named account2 with an initial balance of 0
        BankAccount account2 = new BankAccount(0);
        // Print the initial balance of account1
        System.out.println("Initial balance of account1 is " + account1.getBalance());
        // Print the initial balance of account2 to the console
        System.out.println("Initial balance of account2 is " + account2.getBalance());
    }
}
