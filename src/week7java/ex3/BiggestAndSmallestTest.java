package week7java.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BiggestAndSmallestTest {
    BiggestAndSmallest biggestAndSmallest = new BiggestAndSmallest();


    @Test
    void testNoNumber() {
        List<Integer> numbers = new ArrayList<>();
        Assertions.assertEquals(Optional.empty(), biggestAndSmallest.getBiggest(numbers));


    }

    @Test
    void testNumbers() {
        List<Integer> numbers = Arrays.asList(23, 45, 67, 89, 23, 4);
        Assertions.assertEquals(Optional.of(89), biggestAndSmallest.getBiggest(numbers));


    }
}