package week6java.week6evaluation;

public abstract class Car {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract String drive();






}
//The Car class must be abstract. It has a brand that is given with the constructor. It has the drive method.