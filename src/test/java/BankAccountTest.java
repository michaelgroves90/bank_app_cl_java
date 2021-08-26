import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private class MockTransaction implements ITransaction {
        public double credit() {

        }

        public double debit() {

        }

        public double balance() {

        }

        public String date() {

        }

    }

    private BankAccount account;
    private Transaction transaction;

    @BeforeEach
    void setup() {
        account = new BankAccount(20);
        transaction = new Transaction("2021, 1, 10", 10, 0, account.getBalance());
    }

    @Test
    void testAccountHoldsABalance() {
        assertEquals(20, account.getBalance());
    }

    @Test
    void testDepositsAddToAccountBalance() {
        account.deposit(10, "2021, 1, 10");
        assertEquals(30, account.getBalance());
    }

    @Test
    void testWithdrawalsRemoveFromAccountBalance() {
        account.withdraw(5, "2021, 1, 20");
        assertEquals(15, account.getBalance());
    }

    @Test
    void testAccountCannotBeWithdrawnBelowZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> account.withdraw(21, "2021, 1, 20"));
        assertEquals("Invalid amount, Balance is: 20.0", exception.getMessage());
    }

    @Test
    void testTransactionHistoryIsStored() {
        account.deposit(10, "2021, 1, 10");
        ArrayList<Transaction> transactionHistory = new ArrayList<>();
        transactionHistory.add(transaction);
        assertEquals(transactionHistory, account.getTransactionHistory());
    }

}
