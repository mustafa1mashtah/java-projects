package evaluationweek8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermostatTest {


    @Test
    void testSkiing() {
        Thermostat thermostat = new Thermostat(t -> t < 0, t -> t + " degrees Celsius");
        String sense = thermostat.sense(2.0);
        String expected = "2.0 degrees Celsius";
        Assertions.assertEquals(expected, sense);
        String sense1 = thermostat.sense(-1.0);
        String expected1 = "Warning!";
        Assertions.assertEquals(expected1, sense1);
    }

    @Test
    void testSauna() {
        Thermostat thermostat = new Thermostat(t -> t >= 80, t -> t + 273.15 + " degrees Kelvin");
        String sense = thermostat.sense(79.0);
        String expected = "352.15 degrees Kelvin";
        Assertions.assertEquals(expected, sense);
        String sense1 = thermostat.sense(80.0);
        String expected1 = "Warning!";
        Assertions.assertEquals(expected1, sense1);
    }
}