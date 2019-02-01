package evaluationWeek11;

import java.time.LocalDate;

public class Befor21 implements Dates {
    @Override
    public LocalDate getCountDown(LocalDate localDate) {

        return LocalDate.of(localDate.getYear(),06,21);
    }

    @Override
    public Boolean isRightDate(LocalDate localDate) {
        return !localDate.isLeapYear()&&localDate.isBefore(LocalDate.of(localDate.getYear(),06,21));
    }
}
