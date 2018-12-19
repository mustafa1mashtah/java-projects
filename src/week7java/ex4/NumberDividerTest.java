package week7java.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberDividerTest {
    NumberDivider numberDivider = new NumberDivider();

    @Test
    void testNumber() {
        Integer number = 54783;
        List<Integer> deveidedNumber = Arrays.asList(5, 4, 7, 8, 3);
        Assertions.assertEquals(deveidedNumber, numberDivider.getDividedNumber(number));

    }
}