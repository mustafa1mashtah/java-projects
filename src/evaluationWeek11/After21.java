package evaluationWeek11;

import java.time.LocalDate;

public class After21 implements Dates {
    @Override
    public LocalDate getCountDown(LocalDate localDate) {
        if (LocalDate.of(localDate.getYear() + 1, 01, 01).isLeapYear()) {
            return LocalDate.of(localDate.getYear() + 1, 06, 20);

        } else {
            return LocalDate.of(localDate.getYear() + 1, 06, 21);

        }

    }

    @Override
    public Boolean isRightDate(LocalDate localDate) {
        return !localDate.isLeapYear() && localDate.isAfter(LocalDate.of(localDate.getYear(),06,21));
    }
}
