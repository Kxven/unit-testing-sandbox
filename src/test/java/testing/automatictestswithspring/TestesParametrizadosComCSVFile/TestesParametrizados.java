package testing.automatictestswithspring.TestesParametrizadosComCSVFile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import testing.automatictestswithspring.SimpleMath;

import java.util.stream.Stream;

public class TestesParametrizados {

    @ParameterizedTest
    @DisplayName("Test 6.2 / 2 = 3.1")
    //@MethodSource("testDivisionInputParameters")
    @MethodSource()
    void testDivision(Double firstNumber, Double secondeNumber, Double expect){
        SimpleMath math = new SimpleMath();
        Double actual = math.division(firstNumber, secondeNumber);

        Assertions.assertEquals(expect, actual, 2.D, ()-> firstNumber + " / " + secondeNumber + " did not produce " + expect);
        Assertions.assertNotNull(actual);
    }

    //public static Stream<Arguments> testDivisionInputParameters() {
    public static Stream<Arguments> testDivision() {
        return Stream.of(
                Arguments.of(3.2D, 2D, 3.1),
                Arguments.of(71D, 14D, 5.07D),
                Arguments.of(18.3, 3.1D, 5.90)
        );
    }

}
