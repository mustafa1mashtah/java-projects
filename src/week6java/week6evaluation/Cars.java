package week6java.week6evaluation;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cars {
    public  Car getNextCar(String brand) {
        Random random = new Random();
        List<Car> cars = Arrays.asList(new AutomaticCar(brand), new ManualCar(brand));
        Integer position = random.nextInt(1);
        return cars.get(position);


    }


}
