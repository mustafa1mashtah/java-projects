package week7java.ex1;

import java.util.List;

public class MoneyCalculator {

    public Integer getAccumulatedValue(List<Integer> payments) {
        Integer accumulatedValue = 0;
        for (Integer payment : payments) {
            accumulatedValue += payment;

        }
        return accumulatedValue;


    }


}
