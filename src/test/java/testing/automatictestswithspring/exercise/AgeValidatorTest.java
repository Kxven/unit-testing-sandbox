package testing.automatictestswithspring.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AgeValidatorTest {
    private final AgeValidator ageValidator =  new AgeValidator();

    @Test
    @DisplayName("Twelve is of legal age")
    void test20IsOfLegalAge(){
        Assertions.assertTrue(ageValidator.isOfAe(20));
    }

    @Test
    @DisplayName("Eitchteen is the age of majority")
    void test18IsTheAgeOfMajority(){
        Assertions.assertTrue(ageValidator.isOfAe(18));
    }

    @Test
    @DisplayName("Age 17 is not the age of majority")
    void test17IsNoTheAgeOfMajority(){
        Assertions.assertFalse(ageValidator.isOfAe(17));
    }

    @Test
    @DisplayName("Age:0 is not of legal age")
    void testAge0IsNotofLegalAge(){
        Assertions.assertFalse(ageValidator.isOfAe(0));
    }
}