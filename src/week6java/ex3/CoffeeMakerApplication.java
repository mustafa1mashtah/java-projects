package week6java.ex3;

import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {
    public static void main(String[] args) {
        List<CoffeeMaker> coffeeMakerList = CoffeeMakers.asList();
        for (CoffeeMaker coffeeMaker : coffeeMakerList) {
            Coffee coffee = coffeeMaker.brew();
            System.out.println(coffee.getMadeBy() + " brewed a coffee and it took " + coffee.getBrewedTime() + " minutes");

        }

        checkIfCoffeeMakerExists("Automatic coffee machine");
        checkIfCoffeeMakerExists("French press");
        checkIfCoffeeMakerExists("Auto drip");
        checkIfCoffeeMakerExists("Moka pot");


    }

    static public void checkIfCoffeeMakerExists(String coffeeMakerName) {
        Optional<CoffeeMaker> coffeeMaker = CoffeeMakers.get(coffeeMakerName);
        if (coffeeMaker.isPresent()) {
            coffeeMaker.get().brew();
            System.out.println(coffeeMaker.get().getName() + " brewed a coffee and it took " + coffeeMaker.get().getBrewingTime() + " minutes");
        } else {
            System.out.println("The coffee maker with this " + coffeeMakerName + " is not available");
        }


    }
}
