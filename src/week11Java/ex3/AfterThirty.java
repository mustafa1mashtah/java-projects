package week11Java.ex3;

import java.time.LocalTime;

public class AfterThirty implements TimeCases {
    @Override
    public String getTimeAsString(LocalTime time) {
        return ChangeNumberToWord.getWord(60 - time.getMinute()) + " minutes to " + ChangeNumberToWord.getWord(time.getHour() + 1);

    }

    @Override
    public Boolean isRightCase(LocalTime time) {
        return time.getMinute() > 30;
    }
}
