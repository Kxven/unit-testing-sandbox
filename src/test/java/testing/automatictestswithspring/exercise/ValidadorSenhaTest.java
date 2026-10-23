package testing.automatictestswithspring.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorSenhaTest {
    private final ValidadorSenha validadeSenha =  new ValidadorSenha();

    @Test
    void testShouldBeStrongWhenItHas8CharactersAndANumber(){
        Assertions.assertTrue(validadeSenha.ehSenhaForte("abc12345"));
    }
    @Test
    void testShouldNotBeStrongWhenThereIsNoNumber(){
        Assertions.assertFalse(validadeSenha.ehSenhaForte("abcdefgh"));
    }

    @Test
    void testShouldNotBeStrongWhenItIsVeryShort() {
        Assertions.assertFalse(validadeSenha.ehSenhaForte("abc"));
    }

    @Test
    void  testShouldNotStrongWhenItIsNull(){
        Assertions.assertFalse(validadeSenha.ehSenhaForte(null));
    }

    @Test
    void testShouldNotBeStrongWhenItIsEmpty(){
        Assertions.assertFalse(validadeSenha.ehSenhaForte(""));
    }

}