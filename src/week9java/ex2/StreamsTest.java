package week9java.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week3java.ex9.FileReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamsTest {
    private List<String> names = new FileReader().asStream("week9java/ex2/names.txt").collect(Collectors.toList());

    @Test
    void fileTest() {
        List<String> shorterThanFourLetters = names.stream()
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());

        List<String> expected = Arrays.asList("El");

        Assertions.assertEquals(expected, shorterThanFourLetters);


        List<String> endWithM = names.stream()
                .filter(e -> e.endsWith("m"))
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());

        List<String> expected1 = Arrays.asList("HOSAM", "TAMMAM");

        Assertions.assertEquals(expected1, endWithM);


        List<String> containsEandWithEAndR = names.stream()
                .filter(e -> e.contains("e") && e.contains("r"))
                .collect(Collectors.toList());

        List<String> expected3 = Arrays.asList("Mehran", "Norbert", "Serife");

        Assertions.assertEquals(expected3, containsEandWithEAndR);


        List<String> spectialList = names.stream()
                .filter(e -> e.length() == 4)
                .map(e -> e.toLowerCase())
                .filter(e -> e.contains("a") && e.contains("m"))
                .map(e -> e.replaceAll("a", "aa"))
                .collect(Collectors.toList());

        List<String> expected4 = Arrays.asList("maarj", "aamin", "omaar");

        Assertions.assertEquals(expected4, spectialList);


    }


}
