import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Welcome to our comic shop. How much is your comic?");
        Double price = scanner.nextDouble();
        System.out.println("How much are you going to pay?");
        Double monyPaid = scanner.nextDouble();
        Double change = monyPaid - price;
        Double euro =Math.floor(change);
        Double cent = (change*100)%100;
        Integer cent1=cent.intValue();

        System.out.println("Here yiu are " + euro + "and" + cent1 + "cent");


    }
}
