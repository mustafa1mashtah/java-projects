package evaluationjava2;

import java.util.Scanner;

public class NumberMirrorApplication {
    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner scanner=new Scanner(System.in);
        Integer number=scanner.nextInt();

        NumberMirror numberMirror=new NumberMirror();
        Integer reversedNumber=numberMirror.mirror(number);
        Integer modifeidNumber=numberMirror.specialMirror(reversedNumber);
        System.out.println("the number is "+ number);
        System.out.println("the reverced number is "+ reversedNumber);
        System.out.println("the modifeid number is "+ modifeidNumber);


    }
}
