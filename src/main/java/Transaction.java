public class Transaction {

    private final String date;
    private final double credit;
    private final double debit;
    private final double balance;

    public Transaction(String date, double credit, double debit, double balance) {
        this.date = date;
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
    }
}
