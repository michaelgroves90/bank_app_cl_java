import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount(20);
    }

    @Test
    void testAccountHoldsABalance() {
        assertEquals(20, account.getBalance());
    }

    @Test
    void testDepositsAddToAccountBalance() {
        account.deposit(10);
        assertEquals(30, account.getBalance());
    }

    @Test
    void testWithdrawalsRemoveFromAccountBalance() {
        account.withdraw(5);
        assertEquals(15, account.getBalance());
    }

    @Test
    void testAccountCannotBeWithdrawnBelowZero() {
        assertThrows(ArithmeticException.class, () -> account.withdraw(21));
    }

}
