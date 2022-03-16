package Bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicAccountTest {

    private BankAccount bankAccount;
    @BeforeEach
    void setUp() {
        bankAccount = new BasicAccount("savings", 1000);
    }

    @Test
    void withdraw_Positive() {
        double expectedBalance = 500;
        bankAccount.withdraw(500);
        Assertions.assertEquals(expectedBalance,bankAccount.getBalance());
    }
    @Test
    void withdraw_Negative() {
        double expectedBalance = 1_000;
        bankAccount.withdraw(1_000_000);
        Assertions.assertEquals(expectedBalance,bankAccount.getBalance());
    }
}