package week6java.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamTest {

    @Test
    void testConeIceCream() {
        IceCream cone=new ConeIceCream("Chocolate","Oreo");
        Assertions.assertEquals("The Chocolate ice-cream with Oreo is licked",cone.eat());



    }
    @Test
    void testCupIceCream() {
        IceCream cup=new CupIceCream("Vanilla","Cookies");
        Assertions.assertEquals("The Vanilla ice-cream with Cookies is eaten with a spoon",cup.eat());



    }
}