public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(20);
        System.out.println(account.getBalance());
        try {
            account.withdraw(21);
        } catch (ArithmeticException err) {
            System.out.println(err);
        }
    }
}
