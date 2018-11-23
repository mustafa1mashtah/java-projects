package week32.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.geom.Arc2D;


class NumberCorrectorTest {
    NumberCorrector numberCorrector=new NumberCorrector();

    @Test
    void testCorrect() {

        Double number=numberCorrector.correct(-23.5);


      //  Assertions.assertEquals(23.0, number.doubleValue());
        Assertions.assertEquals(new Double(23),number);

    }
}
//[Testing] Create the NumberCorrectorTest class and test its behavior.
// Write the method testCorrect.