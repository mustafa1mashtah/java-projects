package week7java.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoneyCalculatorTest {

    private MoneyCalculator moneyCalculator = new MoneyCalculator();

    @Test
    void testGetAccumulatedValue() {
        List<Integer> payments = Arrays.asList(3, 4, 5, 2, 1, 3, 4, 5, 3, 1);

        Integer total = moneyCalculator.getAccumulatedValue(payments);

        Integer expected = 31;
        Assertions.assertEquals(expected, total);
    }
}