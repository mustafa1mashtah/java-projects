package week11Java.ex3;

import java.time.LocalTime;

public class isThirty implements TimeCases {
    @Override
    public String getTimeAsString(LocalTime time) {
        return "half past " + ChangeNumberToWord.getWord(time.getHour());
    }

    @Override
    public Boolean isRightCase(LocalTime time) {
        return time.getMinute() == 30;
    }
}
