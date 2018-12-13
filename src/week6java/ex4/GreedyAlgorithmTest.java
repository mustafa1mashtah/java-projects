package week6java.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class GreedyAlgorithmTest {
    GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();

    @Test
    void testZeroChange() {
        Assertions.assertEquals(Optional.empty(), greedyAlgorithm.change(0));
    }

    @Test
    void testValueChange() {
        Assertions.assertEquals(6, greedyAlgorithm.change(88).get().size());
        Assertions.assertEquals(7, greedyAlgorithm.change(149).get().size());
    }


}