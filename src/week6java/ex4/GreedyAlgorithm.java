package week6java.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GreedyAlgorithm {


    public  Optional<List<Money>> change(Integer cents) {
        List<Money> changedMoney = new ArrayList<>();
        List<Money> moneyList = Arrays.asList(new Cent50(50), new Cent20(20), new Cent10(10), new Cent5(5), new Cent2(2), new Cent1(1));
        if (cents == 0) {
            return Optional.empty();
        } else {
            for (Money money : moneyList) {

                if (money.isApplicable(cents)) {
                    Integer repetition = cents / money.getCent();
                    addToList(changedMoney, money, repetition);
                    cents = cents - (money.getCent() * repetition);


                }


            }
        }
        return Optional.of(changedMoney);
    }


    private void addToList(List<Money> moneyList, Money money, Integer repetation) {
        for (int i = 0; i < repetation; i++) {
            moneyList.add(money);


        }
    }


}


//Create the GreedyAlgorithm class.
// It has the change method that receives an Integer amount of the cents that the waiter has to give back,
// and it returns a list of Money with the exact coins that he has to give back.