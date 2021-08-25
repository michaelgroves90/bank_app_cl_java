import java.util.ArrayList;

public class BankAccount {

    public ArrayList<Object> transactionHistory;
    public double balance;

    public BankAccount() {
        this.transactionHistory = new ArrayList<>();
        this.balance = 0;
    }

    public BankAccount(double initialBalance) {
        this.transactionHistory = new ArrayList<>();
        this.balance = initialBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Object> getTransactionHistory() {
        return this.transactionHistory;
    }

    public void deposit(double amount, String date) {
        this.balance += amount;
        Transaction transaction = new Transaction(date, amount, 0, this.balance);
        this.transactionHistory.add(transaction);
    }

    public void withdraw(double amount, String date) {
        if ( amount > this.balance ) {
            throw new ArithmeticException("Invalid amount, Balance is: " + this.getBalance());
        } else {
            this.balance -= amount;
            Transaction transaction = new Transaction(date, 0, amount, this.balance);
            this.transactionHistory.add(transaction);
        }
    }
}
