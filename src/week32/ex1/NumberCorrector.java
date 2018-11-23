package week32.ex1;

public class NumberCorrector {

    public Double correct(Double number) {
        number = Math.abs(number);
        number = Math.floor(number);

        return number;
    }


}
//The NumberCorrector class has no attributes.
// It has the correct method that receives a Double and returns the Integer version of it in absolute terms.