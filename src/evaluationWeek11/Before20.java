package evaluationWeek11;

import java.time.LocalDate;

public class Before20 implements Dates {

    @Override
    public LocalDate getCountDown(LocalDate localDate) {

        return LocalDate.of(localDate.getYear(),06,20);
    }

    @Override
    public Boolean isRightDate(LocalDate localDate) {
        return localDate.isLeapYear()&&localDate.isBefore(LocalDate.of(localDate.getYear(),06,20));
    }
}
