package week6java.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMakersTest {


    @Test
    void testGetCoffeeMaker() {
        Coffee coffee = new Coffee("Automatic coffee machine", 5);
        Optional<CoffeeMaker> automaticCoffeeMachine = CoffeeMakers.get("Automatic coffee machine");
        Assertions.assertEquals(coffee.getMadeBy(), automaticCoffeeMachine.get().getName());
        Assertions.assertEquals(coffee.getBrewedTime(), automaticCoffeeMachine.get().getBrewingTime());


    }
    @Test
    void testNoCoffeeMaker() {
        Coffee coffee = new Coffee("Moka pot", 32);
        Optional<CoffeeMaker> automaticCoffeeMachine = CoffeeMakers.get(coffee.getMadeBy());
        Assertions.assertEquals(Optional.empty(), automaticCoffeeMachine);
        Assertions.assertEquals(Optional.empty(), automaticCoffeeMachine);


    }
}