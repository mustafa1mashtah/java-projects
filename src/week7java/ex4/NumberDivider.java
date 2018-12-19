package week7java.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NumberDivider {
    public List<Integer> getDividedNumber(Integer number) {
        String numberAsString = number.toString();
        List<String> numbersListAsString = Arrays.asList(numberAsString.split(""));
        List<Integer> numbers = new ArrayList<>();
        for (String string : numbersListAsString) {
            Integer partOfNumber = Integer.valueOf(string);
            numbers.add(partOfNumber);


        }
        return numbers;


    }
}
