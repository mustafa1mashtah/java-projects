import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What’s your name?");
        String name = scanner.nextLine();
        System.out.println("Please, tell me your order number.");
        Integer orderNumber = scanner.nextInt();
        Integer result = orderNumber%3;
        Integer price = result*4;
        System.out.println("here you are " + name + " its " + price + " euro");

    }
}
