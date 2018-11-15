import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("tell me your first Number");
        Integer Number1=scanner.nextInt();

        System.out.println("tell me your scond Number");
        Integer Number2=scanner.nextInt();

        Integer sum=Number1+Number2;
        System.out.print("the sum is"+sum);


    }
}
