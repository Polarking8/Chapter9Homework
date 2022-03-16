package Bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private static final String SAVINGS = "savings";
    private BankAccount bankAccount;
    @BeforeEach
    void setUp(){
        bankAccount = new BankAccount("savings", 1000);
    }
    @Test
    void withdraw_Positive() {
        double expectedBalance = 500;
        bankAccount.withdraw(500);
        Assertions.assertEquals(expectedBalance,bankAccount.getBalance());
    }
    @Test
    void withdraw_Negative() {
        double expectedBalance = -500;
        bankAccount.withdraw(1500);
        Assertions.assertEquals(expectedBalance,bankAccount.getBalance());
    }
    @Test
    void deposit() {
        double expectedBalance = 1500;
        bankAccount.deposit(500);
        Assertions.assertEquals(expectedBalance, bankAccount.getBalance());
    }

    @Test
    void getAccountName() {
        Assertions.assertEquals(SAVINGS, bankAccount.getAccountName());
    }
}