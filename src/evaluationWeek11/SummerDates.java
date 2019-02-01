package evaluationWeek11;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummerDates {
    public  List<Dates> dates = Arrays.asList(new After20(), new After21(), new Before20(), new Befor21());

    public  LocalDate getSummerSolsticeCountdown(LocalDate localDate) {
        List<LocalDate> localDates = dates.stream()
                .filter(e -> e.isRightDate(localDate))
                .map(e -> LocalDate.of(e.getCountDown(localDate).getYear(), e.getCountDown(localDate).getMonth(), e.getCountDown(localDate).getDayOfMonth()))
                .collect(Collectors.toList());

        return localDates.get(0);


    }
}
