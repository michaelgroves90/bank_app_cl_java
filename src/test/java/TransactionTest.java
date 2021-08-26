import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {

    private Transaction transaction;

    @BeforeEach
    void setup() {
        transaction = new Transaction("2021, 1, 10", 10, 0, 10);
    }

    @Test
    void testReturnsTransactionCreditAmount() {
        assertEquals(10, transaction.getTransactionCredit());
    }

    @Test
    void testReturnsTransactionDebitAmount() {
        assertEquals(0, transaction.getTransactionDebit());
    }

    @Test
    void testReturnsAccountBalanceAfterTransaction() {
        assertEquals(0, transaction.getTransactionBalance());
    }

    @Test
    void testReturnsTransactionDate() {
        assertEquals("2021, 1, 10", transaction.getTransactionDate());
    }

}
