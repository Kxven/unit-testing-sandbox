package testing.automatictestswithspring.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    private Cart cart;
    @BeforeEach
        void setUp(){
        cart = new Cart();
    }
    @Test
    void testNewCartShouldBeEmpty() {
        assertTrue(cart.isEmpty());
    }
    @Test
    void testAfterAddBookcartcannotBeEmpty(){
        cart.add("Book");
        assertFalse(cart.isEmpty());
    }
    @Test
    void testAfterPutBookContainsIsTrue(){
        cart.add("Book");
        assertTrue(cart.contains("Book"));
    }
    @Test
    void testWhenContainsPenInACartWithoutAPenIsFalse(){
        cart.add("Book");
        assertFalse(cart.contains("Pen"));
    }
    @Test
    void addingNullThrowsIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () ->{
            cart.add(null);
        });
    }

    @Test
    void addStringEmptyThrowsIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()->{
            cart.add("   ");
        });
    }
    @Test
    void dropAnItemThatIsNotInTheCarThrowsIllegalStateException(){
        cart.add("Pen");
        assertThrows(IllegalStateException.class,() ->{
            cart.remove("Book");
        });
    }
    @Test
    void AddAndAfterRemoveBookLeaveTheCartEmpty(){
        cart.add("book");
        cart.remove("book");
        assertTrue(cart.isEmpty());
    }

}