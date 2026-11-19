public class Usercase4 {
    public static void main(String[] args) {
        double balance = 5000.0;
        double withdrawAmount = 10500.0;

        try {
            withdraw(balance, withdrawAmount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Transaction successfully completed.");
        }
    }

    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Balance insufficient");
        else {
            balance -= amount;
            System.out.println("Amount successfully withdraw " + balance);
        }
    }
    static class InsufficientBalanceException extends Exception {
        InsufficientBalanceException(String message) {
            super(message);
        }
    }
}