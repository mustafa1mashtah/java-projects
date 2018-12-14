package week6java.week6evaluation;

import java.util.Arrays;
import java.util.List;

public class CarApplication {
    public static void main(String[] args) {
        Hansel hansel=new Hansel();
        Cars cars=new Cars();


        List<String>carsList= Arrays.asList("Audi","Mercedes","Seat","Skoda","Tesla","Bmw","Peugeot","Citroen","Citroen","Jeep","Ferrari");
        for (String carType : carsList) {
            Car nextCar = cars.getNextCar(carType);
            System.out.println(hansel.haveATry(nextCar));


        }




    }
}
//The CarApplication creates one Hansel and using the Cars class tries 10 cars.
//I love this Manual Audi
//I love this Automatic Mercedes
//I love this Manual Seat
//I love this Automatic Skoda
//I love this Automatic Tesla
//I love this Automatic Bmw
//I love this Automatic Peugeot
//I love this Manual Citroen
//I love this Manual Jeep
//I love this Automatic Ferrari