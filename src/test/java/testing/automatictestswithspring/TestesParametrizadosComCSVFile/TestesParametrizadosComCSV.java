package testing.automatictestswithspring.TestesParametrizadosComCSVFile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import testing.automatictestswithspring.SimpleMath;

public class TestesParametrizadosComCSV {

    @ParameterizedTest
    @DisplayName("Test 6.2 / 2 = 3.1")
    @CsvSource({
            "3.2D, 2D, 3.1",
            "71D, 14D, 5.07D",
            "18.3, 3.1D, 5.90"
    })
    void testDivision(Double firstNumber, Double secondeNumber, Double expect){
        SimpleMath math = new SimpleMath();
        Double actual = math.division(firstNumber, secondeNumber);

        Assertions.assertEquals(expect, actual, 2.D, ()-> firstNumber + " / " + secondeNumber + " did not produce " + expect);
        Assertions.assertNotNull(actual);
    }
}
