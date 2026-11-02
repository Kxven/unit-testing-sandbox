package testing.automatictestswithspring.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {
    private final Triangle triangle = new Triangle();

    @Test
    void testhouldBeValidWhenSidesFormTriangule(){
        assertTrue(triangle.isValid(3,4,5));
    }

    @Test
    void testShouldNotBeValidWhenOneSideIsTooLarge(){
        assertFalse(triangle.isValid(1,2,10));
    }

    @Test
    void testShouldNotBeValidWhenSumEqualsThirdSide(){
        assertFalse(triangle.isValid(1,2,3));
    }

    @Test
    void testShouldBeThrowExceptionWhenOneSideIsZero(){
        assertThrows(IllegalArgumentException.class, ()->{
            triangle.isValid(0,4,5);
        });
    }

    @Test
    void testShouldThrowErrorWhenOneSideIsNegative(){
        assertThrows(IllegalArgumentException.class, ()->{
            triangle.isValid(-1,4,5);
        });
    }
}
