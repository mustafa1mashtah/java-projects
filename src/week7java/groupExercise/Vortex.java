package week7java.groupExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vortex {
    public Integer getVortexNumber(Integer number) {
        List<Integer> digits = getDigits(number);
        Integer sum = 0;
        for (Integer digit : digits) {
            sum += digit;
        }
        return sum;


    }

    private List<Integer> getDigits(Integer number) {
        List<Integer> digits = new ArrayList<>();
        List<String> characters = Arrays.asList(number.toString().split(""));
        for (String character : characters) {
            digits.add(Integer.valueOf(character));

        }
        return digits;


    }
}
