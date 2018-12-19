package week7java.ex3;

import java.util.Arrays;
import java.util.List;

public class mainApplication {
    public static void main(String[] args) {
        BiggestAndSmallest biggestAndSmallest = new BiggestAndSmallest();
        List<Integer> numbers = Arrays.asList();
        System.out.println(biggestAndSmallest.getBiggest(numbers));
        System.out.println(biggestAndSmallest.getSmallest(numbers));
    }
}
