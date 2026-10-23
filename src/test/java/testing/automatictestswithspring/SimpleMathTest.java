package testing.automatictestswithspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Test Math Operatios in SimpleMath Class")
class SimpleMathTest {

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum(){
        //Given / Arrange
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2D;
        Double secondeNumber = 2D;
        Double expect = 8.2D;

        //When /Act
        Double actual = math.sum(firstNumber, secondeNumber);

        //Then /Assert
        Assertions.assertEquals(expect, actual, () -> firstNumber + " + " + secondeNumber + " not produce " + expect);
        Assertions.assertNotEquals(9.1D, actual);
        Assertions.assertNotNull(actual);
    }
    @Disabled("TODO: I need still work on it")
    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSumExampleDisabled(){
        //Given / Arrange
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.2D;
        Double secondeNumber = 2D;
        Double expect = 8.2D;

        //When /Act
        Double actual = math.sum(firstNumber, secondeNumber);

        //Then /Assert
        Assertions.assertEquals(expect, actual, () -> firstNumber + " + " + secondeNumber + " not produce " + expect);
        Assertions.assertNotEquals(9.1D, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
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
    @DisplayName("6.2 * 2  = 12.4 ")
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
    @DisplayName("Test 6.2 / 2 = 3.1")
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
    @DisplayName("Test (6.2 + 2) / 2  = 4.1 ")
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
    @DisplayName("Test Square Root of 81 = 9")
    void testsquareRoot(){
        SimpleMath math = new SimpleMath();
        Double number = 25D;
        Double expect  = 5D;



        Double actual = math.squareRoot(number);

        Assertions.assertEquals(expect, actual, ()-> "Square root of " + number + " did not produce squareRoot for " + expect);
        Assertions.assertNotNull(actual);

    }



}