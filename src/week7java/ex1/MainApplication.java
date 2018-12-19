package week7java.ex1;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        MoneyCollector moneyCollector = new MoneyCollector();
        List<Integer> payments = moneyCollector.getPayments();
        Integer accumulatedValue = moneyCalculator.getAccumulatedValue(payments);
        System.out.println("the Payments are " + payments);
        System.out.println("the Accumulated Value is " + accumulatedValue);
    }
}
