public class Usercase4 {
    public static void main(String[] args) {
        double balance = 5000.0;
        double withdrawAmount = 7500.0;

        try {
            withdraw(balance, withdrawAmount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
    }

    static void withdraw(double balance, double amount) {
        if (amount > balance)
            throw new InsufficientBalanceException("Balance insufficient");
        else {
            balance -= amount;
            System.out.println("Amount successfully withdraw " + balance);
        }
    }
    static void  InsufficientBalanceException extends Exception
}