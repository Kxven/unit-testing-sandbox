package testing.automatictestswithspring.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {
    private final PasswordValidator passwordValidator =  new PasswordValidator();

    @Test
    void testShouldBeStrongWhenItHas8CharactersAndANumber(){
        Assertions.assertTrue(passwordValidator.ItIsAStrongPassword("abc12345"));
    }
    @Test
    void testShouldNotBeStrongWhenThereIsNoNumber(){
        Assertions.assertFalse(passwordValidator.ItIsAStrongPassword("abcdefgh"));
    }

    @Test
    void testShouldNotBeStrongWhenItIsVeryShort() {
        Assertions.assertFalse(passwordValidator.ItIsAStrongPassword("abc"));
    }

    @Test
    void  testShouldNotStrongWhenItIsNull(){
        Assertions.assertFalse(passwordValidator.ItIsAStrongPassword(null));
    }

    @Test
    void testShouldNotBeStrongWhenItIsEmpty(){
        Assertions.assertFalse(passwordValidator.ItIsAStrongPassword(""));
    }

}