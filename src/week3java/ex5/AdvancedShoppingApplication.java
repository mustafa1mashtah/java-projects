package week3java.ex5;

import java.util.ArrayList;
import java.util.List;

public class AdvancedShoppingApplication {
    public static void main(String[] args) {
        List<Grocery> groceries = new ArrayList<>();
        System.out.println("Groceries: " + groceries);
        Grocery name1 = new Grocery("banana");
        Grocery name2 = new Grocery("tomato");
        Grocery name3 = new Grocery("potato");

        groceries.add(name1);
        groceries.add(name2);
        groceries.add(name3);


        System.out.println("Groceries: " + groceries);

        Grocery name4 = new Grocery("banana");

        groceries.remove(name4);


        System.out.println("Groceries: "+ groceries);

        Grocery name5 = new Grocery("potato");
        Grocery name6 = new Grocery("potato");
        groceries.add(name5);
        groceries.add(name6);
        System.out.println("Groceries: "+groceries);

        groceries.remove(2);
        System.out.println("Groceries: "+groceries);
        System.out.println("The size is: "+groceries.size());




    }
}
