package evaluationWeek11;

import java.time.LocalDate;

public class SolsticeCountdownMessages {
    private SummerDates summerDates = new SummerDates();

    public String getSummerMessage(LocalDate localDate) {
        LocalDate summerSolsticeCountdown = summerDates.getSummerSolsticeCountdown(localDate);
        return "The Summer Solstice " + localDate.getYear() + " is on " + summerSolsticeCountdown.getDayOfWeek()
                + ", " + summerSolsticeCountdown.getMonth() + " "
                + summerSolsticeCountdown.getDayOfMonth() + ", " + summerSolsticeCountdown.getYear() + ".";
    }

}
