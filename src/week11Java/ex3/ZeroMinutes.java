package week11Java.ex3;

import java.time.LocalTime;

public class ZeroMinutes implements TimeCases {
    @Override
    public String getTimeAsString(LocalTime time) {
        return ChangeNumberToWord.getWord(time.getHour()) + " o' clock";
    }

    @Override
    public Boolean isRightCase(LocalTime time) {
        return time.getMinute() == 00;
    }
}
