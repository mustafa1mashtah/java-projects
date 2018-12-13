package week6java.ex2;

public class IceCreamApplication {
    public static void main(String[] args) {
        IceCream cone=new ConeIceCream("Chocolate","Oreo");
        System.out.println(cone.eat());

        IceCream cup=new CupIceCream("Vanilla","Cookies");
        System.out.println(cup.eat());







    }
}
