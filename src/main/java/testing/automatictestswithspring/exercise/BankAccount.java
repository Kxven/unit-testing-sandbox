package testing.automatictestswithspring.exercise;

public class BankAccount {

    private double balance;

    public BankAccount(double openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative");
        }
        this.balance = openingBalance;
    }

    public void withdraw(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (value > balance) {
            throw new IllegalStateException("Insufficient balance");
        }
        balance -= value;
    }

    public double getBalance() {
        return balance;
    }
}