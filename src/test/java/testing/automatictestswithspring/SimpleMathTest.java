package testing.automatictestswithspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    void testSum(){
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2D;
        Double secondeNumber = 2D;

        Double actual = math.sum(firstNumber, secondeNumber);
        Double expect = 8.2D;

        Assertions.assertEquals(expect, actual, () -> firstNumber + " + " + secondeNumber + " not produce " + expect);
        Assertions.assertNotEquals(9.1D, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    void testSubtraction(){
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2D;
        Double secondeNumber = 2D;

        Double actual = math.subtraction(firstNumber, secondeNumber);
        Double expect = 4.2D;

        Assertions.assertEquals(expect, actual, ()-> firstNumber + " - " + secondeNumber + " did not produce " + expect);
        Assertions.assertNotNull(actual);
    }

    @Test
    void testMultiplication(){
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2D;
        Double secondeNumber = 2D;

        Double actual = math.multiplication(firstNumber, secondeNumber);
        Double expect = 12.4;

        Assertions.assertEquals(expect, actual, ()-> firstNumber + " * " + secondeNumber + " did not produce " + expect);
        Assertions.assertNotNull(actual);
    }

    @Test
    void testDivision(){
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2D;
        Double secondeNumber = 2D;

        Double actual = math.division(firstNumber, secondeNumber);
        Double expect = 3.1D;

        Assertions.assertEquals(expect, actual, ()-> firstNumber + " / " + secondeNumber + " did not produce " + expect);
        Assertions.assertNotNull(actual);
    }

    @Test
    void testMean(){
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2D;
        Double secondeNumber = 2D;

        Double actual = math.mean(firstNumber, secondeNumber);
        Double expect = 4.1D;
        //(6.2 + 2)/2
        Assertions.assertEquals(expect, actual, ()-> "( " + firstNumber + " + " + secondeNumber +" )" + " / " + " 2"  + " did not produce %  " + expect);
        Assertions.assertNotNull(actual);
    }

    @Test
    void testsquareRoot(){
        SimpleMath math = new SimpleMath();
        Double number = 25D;
        Double expect  = 5D;



        Double actual = math.squareRoot(number);

        Assertions.assertEquals(expect, actual, ()-> "Square root of " + number + " did not produce squareRoot for " + expect);
        Assertions.assertNotNull(actual);

    }



}