public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(20);
        System.out.println(account.getBalance());
        account.withdraw(100);
    }
}
