package evaluationWeek11;

import java.time.LocalDate;

public class After20 implements Dates {
    @Override
    public LocalDate getCountDown(LocalDate localDate) {

        return LocalDate.of(localDate.getYear()+1,06,21);
    }

    @Override
    public Boolean isRightDate(LocalDate localDate) {
        return localDate.isLeapYear()&&localDate.isAfter(LocalDate.of(localDate.getYear(),06,20));
    }
}
