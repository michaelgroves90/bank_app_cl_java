import java.util.ArrayList;

public class BankAccount {

    ArrayList<Transaction> transactionHistory;
    double balance;

    BankAccount() {
        this.transactionHistory = new ArrayList<>();
        this.balance = 0;
    }

    BankAccount(double initialBalance) {
        this.transactionHistory = new ArrayList<>();
        this.balance = initialBalance;
    }

    double getBalance() {
        return this.balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    ArrayList<Transaction> getTransactionHistory() {
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
