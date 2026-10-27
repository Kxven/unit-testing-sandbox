package testing.automatictestswithspring.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarrinhoTest {
    private Carrinho carrinho;
    @BeforeEach
        void setUp(){
        carrinho = new Carrinho();
    }
    @Test
    void testNewCartShouldBeEmpty() {
        assertTrue(carrinho.estaVazio());
    }
    @Test
    void testAfterAddBookcartcannotBeEmpty(){
        carrinho.adicionar("Book");
        assertFalse(carrinho.estaVazio());
    }
    @Test
    void testAfterPutBookContainsIsTrue(){
        carrinho.adicionar("Book");
        assertTrue(carrinho.contem("Book"));
    }
    @Test
    void testWhenContainsPenInACartWithoutAPenIsFalse(){
        carrinho.adicionar("Book");
        assertFalse(carrinho.contem("Pen"));
    }
    @Test
    void addingNullThrowsIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () ->{
            carrinho.adicionar(null);
        });
    }


    //Carrinho novo está vazio (assertTrue)
//Depois de adicionar "Livro", o carrinho não está vazio (assertFalse)

//Depois de adicionar "Livro", contem("Livro") é verdadeiro (assertTrue)
//contem("Caneta") em um carrinho sem caneta é falso (assertFalse)


//Adicionar null lança IllegalArgumentException (assertThrows)
//Adicionar " " (só espaços) lança IllegalArgumentException (assertThrows)
//Remover um item que não está no carrinho lança IllegalStateException (assertThrows)
//Adicionar e depois remover "Livro" deixa o carrinho vazio (assertTrue)

}