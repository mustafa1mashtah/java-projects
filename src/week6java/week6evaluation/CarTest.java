package week6java.week6evaluation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testDriveAutomaticCar() {
        AutomaticCar automaticCar=new AutomaticCar("Audi");
        Assertions.assertEquals("AutomaticCar Audi",automaticCar.drive());
    }
    @Test
    void testDriveManualCar() {
        ManualCar manualCar=new ManualCar("Audi");
        Assertions.assertEquals("ManualCar Audi",manualCar.drive());
    }
}