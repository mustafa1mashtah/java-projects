package evaluationWeek11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SolsticeCountdownMessagesTest {

    @Test
    void getSummerMessage() {
        SolsticeCountdownMessages solsticeCountdownMessages=new SolsticeCountdownMessages();
        String expected="The Summer Solstice 2019 is on FRIDAY, JUNE 21, 2019.";
        LocalDate localDate=LocalDate.of(2019,02,01);
        Assertions.assertEquals(expected,solsticeCountdownMessages.getSummerMessage(localDate));
    }
}