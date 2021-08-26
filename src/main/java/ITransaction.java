public interface ITransaction {

    double credit();
    double debit();
    String date();
    double balance();

}
