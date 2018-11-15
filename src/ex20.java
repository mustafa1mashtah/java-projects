import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Woof food do I get today!?");
        Integer food =scanner.nextInt();
        Integer jumbTimes =6*food;
        Integer barkTimes =1+food;
        System.out.println("jumbs "+jumbTimes+ "times and bark "+barkTimes+ "times");
    }
}
