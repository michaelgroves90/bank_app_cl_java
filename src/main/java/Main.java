public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000, "2021, 1, 10");
        account.deposit(250, "2021, 2, 12");
        System.out.println(account.getBalance());
        System.out.println(account.getTransactionHistory());
        try {
            account.withdraw(1101, "2021, 2, 12");
        } catch (ArithmeticException err) {
            System.out.println(err);
        }
    }
}
