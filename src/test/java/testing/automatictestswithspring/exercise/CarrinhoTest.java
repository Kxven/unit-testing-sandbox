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

    @Test
    void addStringEmptyThrowsIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()->{
            carrinho.adicionar("   ");
        });
    }
    @Test
    void dropAnItemThatIsNotInTheCarThrowsIllegalStateException(){
        carrinho.adicionar("Pen");
        assertThrows(IllegalStateException.class,() ->{
            carrinho.remover("Book");
        });
    }
    @Test
    void AddAndAfterRemoveBookLeaveTheCartEmpty(){
        carrinho.adicionar("book");
        carrinho.remover("book");
        assertTrue(carrinho.estaVazio());
    }

}