
// Encapsulated Class
class BankAccount {
    // Private variables - Direct access restricted
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // Getter for Balance
    public double getBalance() {
        return balance;
    }

    // Setter for Balance with Validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Muzammil", 1000.0);

        // Accessing data securely via methods
        System.out.println("Initial Balance: $" + account.getBalance());
        
        account.deposit(500.0);
        System.out.println("Updated Balance: $" + account.getBalance());
    }
}