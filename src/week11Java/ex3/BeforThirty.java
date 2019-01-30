package week11Java.ex3;

import java.time.LocalTime;

public class BeforThirty implements TimeCases {

    @Override
    public String getTimeAsString(LocalTime time) {

        return  ChangeNumberToWord.getWord(time.getMinute()) + " minutes after " +ChangeNumberToWord.getWord(time.getHour()) ;
    }

    @Override
    public Boolean isRightCase(LocalTime time) {
        return time.getMinute() < 30 && time.getMinute() != 0;
    }
}
