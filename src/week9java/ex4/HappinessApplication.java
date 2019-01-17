package week9java.ex4;


import week3java.ex11.HappinessRecord;
import week3java.ex9.FileReader;

import java.util.Arrays;
import java.util.Comparator;



public class HappinessApplication {
    public static void main(String[] args) {


        new FileReader().asStream("week9java/ex4/world-happiness-2017.csv")
                .skip(1)
                .map(e -> Arrays.asList(e.split(";")))
                .map(e -> new HappinessRecord(Integer.valueOf(e.get(1)), e.get(0), Double.valueOf(e.get(2))))
                .sorted(Comparator.comparingInt(e -> e.getRank()))
                .limit(5)
                .forEach(e -> System.out.println(e));


    }
}
