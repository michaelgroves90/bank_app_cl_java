import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    void testAccountHoldsABalance() {
        BankAccount account = new BankAccount();
        Integer balance = account.getBalance();
        assertEquals(0, balance);
    }

}
