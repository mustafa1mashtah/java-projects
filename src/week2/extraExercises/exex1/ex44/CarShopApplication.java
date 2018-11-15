package week2.extraExercises.exex1.ex44;

public class CarShopApplication {
    public static void main(String[] args) {
        Seller seller=new Seller();
        Car car1=new Car("volvo");
        Car car2=new Car("mercedes");
        Car car3=new Car("audi");
        seller.describe(car1);
        seller.describe(car2);
        seller.describe(car3);

    }






}
