package evaluationWeek11;

import java.time.LocalDate;

public class SolsticeCountDownMessages {
    private SummerDates summerDates = new SummerDates();

    public String getWinterMessage(LocalDate localDate) {
        LocalDate summerSolsticeCountdown = summerDates.getSummerSolsticeCountdown(localDate);
        return "The Summer Solstice " + localDate.getYear() + " is on " + summerSolsticeCountdown.getDayOfWeek()
                + ", " + summerSolsticeCountdown.getMonth() + " "
                + summerSolsticeCountdown.getDayOfMonth() + ", " + summerSolsticeCountdown.getYear() + ".";
    }

}
