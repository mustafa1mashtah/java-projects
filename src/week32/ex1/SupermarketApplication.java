package week32.ex1;

public class SupermarketApplication {
    public static void main(String[] args) {
        Double number = -3.2;
        NumberCorrector numberCorrector = new NumberCorrector();
        Double correctedNumber=numberCorrector.correct(number);
        System.out.println(correctedNumber);

    }
}
//In the SupermarketApplication class main method,
// create one Double number and a NumberCorrector and correct it to see the results.