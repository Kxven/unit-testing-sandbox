package testing.automatictestswithspring.TestesParametrizadosComCSVFile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import testing.automatictestswithspring.SimpleMath;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestesParametrizadosComValueSource {

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod(){
        math = new SimpleMath();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Pelé", "Senna", "Keith Mon"})
    void testValueSource(String fistName){
        System.out.println(fistName);
        assertNotNull(fistName);
    }

}
