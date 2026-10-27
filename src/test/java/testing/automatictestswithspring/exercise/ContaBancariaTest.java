package testing.automatictestswithspring.exercise;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void testShouldThrowErrorWhenCreatingAccountWithNegativeBalance(){
        assertThrows(IllegalArgumentException.class, () -> {
                new ContaBancaria(-100);
        });
    }

    @Test
    void testShouldThrowErrorWhenWhiteDrawingZero(){
        ContaBancaria conta = new ContaBancaria(100);
        assertThrows(IllegalArgumentException.class, ()->{
            conta.sacar(0);
        });
    }

    @Test
    void testShouldThrowErrorWhenWhiteDrawingNegativeAmouth(){
        ContaBancaria conta = new ContaBancaria(100);
        assertThrows(IllegalArgumentException.class, () ->{
            conta.sacar(-50);
        });
    }

    @Test
    void testShouldThrowErrorWhenBalanceIsInsulfficient(){
        ContaBancaria conta = new ContaBancaria(100);
        assertThrows(IllegalStateException.class, () ->{
            conta.sacar(500);
        });
    }

    @Test
    void testShouldDrawingSuccessfullyAndUpdateBalance(){
        ContaBancaria conta = new ContaBancaria(100);
        assertDoesNotThrow(() -> {
            conta.sacar(50);
        });
        assertEquals(50.0, conta.getSaldo());
    }
}