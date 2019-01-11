package evaluationweek8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {
     private Predicate<Double>triger;
     private Function<Double,String>display;

    public Thermostat(Predicate<Double> triger, Function<Double,String> display) {
        this.triger = triger;
        this.display = display;
    }

//    public Predicate<Double> getTriger() {
//        return triger;
//    }
//
//    public Function<Double,String> getDisplay() {
//        return display;
//    }

    public String sense(Double temperature){
        if (!triger.test(temperature)){
            return display.apply(temperature);
        }
        return "Warning!";

    }
}
