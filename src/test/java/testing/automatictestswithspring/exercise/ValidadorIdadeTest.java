package testing.automatictestswithspring.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorIdadeTest {
    private final ValidadorIdade validadorIdade =  new ValidadorIdade();

    @Test
    @DisplayName("Twelve is of legal age")
    void test20IsOfLegalAge(){
        Assertions.assertTrue(validadorIdade.ehMaiorDeIdade(20));
    }

    @Test
    @DisplayName("Eitchteen is the age of majority")
    void test18IsTheAgeOfMajority(){
        Assertions.assertTrue(validadorIdade.ehMaiorDeIdade(18));
    }

    @Test
    @DisplayName("Age 17 is not the age of majority")
    void test17IsNoTheAgeOfMajority(){
        Assertions.assertFalse(validadorIdade.ehMaiorDeIdade(17));
    }

    @Test
    @DisplayName("Age:0 is not of legal age")
    void testAge0IsNotofLegalAge(){
        Assertions.assertFalse(validadorIdade.ehMaiorDeIdade(0));
    }


}