package EXCEPTION_SCENARIO;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void withdraw(double amount)
            throws InsufficientFundsException, InvalidAmountException {

        if (amount % 100 != 0) {
            throw new InvalidAmountException("Amount must be in multiples of 100");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

public class bank {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(101, 1000);

        try {
            acc.withdraw(500);
            acc.withdraw(250);
            acc.withdraw(600);
        }
        catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}

