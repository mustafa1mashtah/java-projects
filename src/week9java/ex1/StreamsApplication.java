package week9java.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamsApplication {
    public static void main(String[] args) {
        List<Integer> numbers = getFirstTwentyNumbers();
        List<Integer> even = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers:" + even);

        List<Integer> odd = numbers.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd numbers:" + odd);


        List<Integer> divisibleByThreeAndBiggerThanTen = numbers.stream()
                .filter(e -> e % 3 == 0)
                .filter(e -> e > 10)
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and bigger than 10:" + divisibleByThreeAndBiggerThanTen);


        List<Integer> modified = numbers.stream()
                .filter(e -> e < 5)
                .map(e -> e * 3)
                .collect(Collectors.toList());
        System.out.println("Numbers smaller than 5 and multiplied by 3:" + modified);

        List<String> spetialNumbers = numbers.stream()
                .filter(e -> e > 8 && e < 12)
                .map(e -> e.toString())
                .map(e -> "number " + String.valueOf(e) + " has " + e.length() + " digits")
                .collect(Collectors.toList());
        System.out.println("Digits of numbers bigger than 8 and smaller than 12: "+spetialNumbers);


    }

    private static List<Integer> getFirstTwentyNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);

        }
        return numbers;
    }
}
