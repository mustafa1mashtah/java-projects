package week6java.week6evaluation;

public class AutomaticCar extends Car {
    public AutomaticCar(String brand) {
        super(brand);
    }


    @Override
    public String drive() {
        return "AutomaticCar "+getBrand();
    }

}
