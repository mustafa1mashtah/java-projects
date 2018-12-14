package week6java.week6evaluation;

public class ManualCar extends Car {
    public ManualCar(String brand) {
        super(brand);
    }

    @Override
    public String drive() {
        return "ManualCar "+getBrand();
    }
}
