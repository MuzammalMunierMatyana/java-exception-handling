// 1. Custom Exception Class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    // 2. Method declaring potential exception using 'throws'
    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            // 3. Explicitly 'throw'ing a custom exception
            throw new InsufficientBalanceException("Error: Insufficient balance for this transaction.");
        }
        System.out.println("Success: Withdrawal of $" + amount + " completed successfully.");
    }

    public static void main(String[] args) {
        try {
            // Attempting to withdraw more than available balance
            withdraw(5000.0, 7000.0); 
        } catch (InsufficientBalanceException e) {
            // Handling the custom exception gracefully
            System.out.println("Transaction Failed: " + e.getMessage());
        }
    }
}