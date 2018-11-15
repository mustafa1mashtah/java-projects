import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        List<Integer> ballsNumber = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a Number:");
            Integer number = scanner.nextInt();
            ballsNumber.add(number);

        }


        for (Integer ball: ballsNumber
             ) {System.out.println(ball);

        }
    }
}
