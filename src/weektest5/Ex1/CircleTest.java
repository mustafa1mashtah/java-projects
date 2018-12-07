package weektest5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testCircleCircle() {
        Circle circle=new Circle();
        Assertions.assertEquals("circle",circle.getName());


    }
    @Test
    void testCircleShape() {
        Shape circle=new Circle();
        Assertions.assertEquals("circle",circle.getName());


    }
}