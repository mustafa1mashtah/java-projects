package week6java.ex3;

public class FrenchPress extends CoffeeMaker {
    @Override
    public String getName() {
        return "French press";
    }

    @Override
    public Integer getBrewingTime() {
        return 10;
    }

}
