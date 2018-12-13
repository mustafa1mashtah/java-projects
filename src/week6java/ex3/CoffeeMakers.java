package week6java.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {
    private static List<CoffeeMaker> coffeeMakerList = Arrays.asList(new AutomaticCoffeeMachine(), new FrenchPress(), new AutoDrip());

    public static List<CoffeeMaker> asList() {

        return coffeeMakerList;

    }

    public static Optional<CoffeeMaker> get(String nameOfCoffeeMaker) {
        for (CoffeeMaker coffeeMaker : asList()) {
            if (nameOfCoffeeMaker.equals(coffeeMaker.getName())) {
                return Optional.of(coffeeMaker);
            }


        }


        return Optional.empty();
    }

}
