package testing.automatictestswithspring.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testShouldThrowErrorWhenCreatingAccountWithNegativeBalance(){
        assertThrows(IllegalArgumentException.class, () -> {
                new BankAccount(-100);
        });
    }

    @Test
    void testShouldThrowErrorWhenWhiteDrawingZero(){
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, ()->{
            account.withdraw(0);
        });
    }

    @Test
    void testShouldThrowErrorWhenWhiteDrawingNegativeAmouth(){
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () ->{
            account.withdraw(-50);
        });
    }

    @Test
    void testShouldThrowErrorWhenBalanceIsInsulfficient(){
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalStateException.class, () ->{
            account.withdraw(500);
        });
    }

    @Test
    void testShouldDrawingSuccessfullyAndUpdateBalance(){
        BankAccount account = new BankAccount(100);
        assertDoesNotThrow(() -> {
            account.withdraw(50);
        });
        assertEquals(50.0, account.getBalance());
    }
}