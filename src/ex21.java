import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        System.out.println("what is the last episode umber you watched?");
        Scanner scanner =new Scanner(System.in);
        Double episode = scanner.nextDouble();
        Double number = episode/13;
        Integer number1 = number.intValue();
        System.out.print(number1);
        Double totalTime =(episode*47)-(13*(episode-12)*number1);
        Double hours =totalTime/60;
        Double AGE = Math.floor(hours);
        Double minutes =totalTime%60;
        System.out.println("you have watched a total of: "+ AGE +"and "+ minutes + "( "+totalTime+")");

    }
}
