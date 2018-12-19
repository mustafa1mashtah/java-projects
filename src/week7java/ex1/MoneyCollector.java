package week7java.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MoneyCollector {


    public List<Integer> getPayments() {
        Random random = new Random();
        List<Integer> payments = new ArrayList<>();
        for (int friendNumber = 0; friendNumber < 10; friendNumber++) {
            Integer paymentNumber = random.nextInt(5) + 1;
            payments.add(paymentNumber);

        }
        return payments;


    }


}
