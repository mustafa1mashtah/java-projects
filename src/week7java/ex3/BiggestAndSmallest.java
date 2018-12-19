package week7java.ex3;

import java.util.List;
import java.util.Optional;

public class BiggestAndSmallest {
    public Optional<Integer> getBiggest(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return Optional.empty();
        }

        Integer biggestNumber = numbers.get(0);
        for (Integer number : numbers) {
            if (number > biggestNumber) {
                biggestNumber = number;
            }

        }
        return Optional.of(biggestNumber);


    }

    public Optional<Integer> getSmallest(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return Optional.empty();
        }

        Integer smallestNumber = numbers.get(0);
        for (Integer number : numbers) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }

        }
        return Optional.of(smallestNumber);


    }
}
