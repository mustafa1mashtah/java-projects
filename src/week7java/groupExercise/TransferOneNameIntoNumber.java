package week7java.groupExercise;

import java.util.ArrayList;
import java.util.List;

public class TransferOneNameIntoNumber {
    public Integer getNameNumber(String name) {
        List<Integer> lettersNumbers = getLettersNumbers(name);
        Integer value = 0;
        for (Integer lettersNumber : lettersNumbers) {
            value += lettersNumber;

        }

        return value;

    }

    private List<Integer> getLettersNumbers(String name) {
        List<Integer> lettersNumbers = new ArrayList<>();
        Integer length = name.length();
        for (int position = 0; position < length; position++) {
            int number = (int) name.charAt(position);
            lettersNumbers.add(number);

        }
        return lettersNumbers;
    }




}
