package testing.automatictestswithspring.TestesParametrizadosComCSVFile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import testing.automatictestswithspring.exercise.simpleMath.SimpleMath;

public class TestesParametrizadosComCsvFile {

    @ParameterizedTest
    @DisplayName("Test double subtraction [firstNumber, secondeNumber, expected]")
    @CsvFileSource(resources = "/testsParametrizados.csv")
    void testDivision(Double firstNumber, Double secondeNumber, Double expect){
        SimpleMath math = new SimpleMath();
        Double actual = math.division(firstNumber, secondeNumber);

        Assertions.assertEquals(expect, actual, 2.D, ()-> firstNumber + " / " + secondeNumber + " did not produce " + expect);
        Assertions.assertNotNull(actual);
    }
}
