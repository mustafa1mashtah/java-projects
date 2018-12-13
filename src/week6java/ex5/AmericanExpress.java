package week6java.ex5;
import java.util.Arrays;

public class AmericanExpress extends CreditCard {


    public AmericanExpress() {
        super(Arrays.asList(15), Arrays.asList(34, 37));
    }

    @Override
    public String getNameOfCreditCard() {
        return "American Express";
    }

}
