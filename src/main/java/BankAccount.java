public class BankAccount {

    public double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if ( amount > this.balance ) {
            throw new ArithmeticException("Invalid amount, Balance is:" + this.getBalance());
        } else {
            this.balance -= amount;
        }
    }
}
