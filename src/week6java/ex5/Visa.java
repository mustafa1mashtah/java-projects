package week6java.ex5;
import java.util.Arrays;

public class Visa extends CreditCard {

    public Visa() {
        super(Arrays.asList(13, 16), Arrays.asList(40, 41, 42, 43, 44, 45, 46, 47, 48, 49));
    }

    @Override
    public String getNameOfCreditCard() {
        return "Visa";
    }
}
