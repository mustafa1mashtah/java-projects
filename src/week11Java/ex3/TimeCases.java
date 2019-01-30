package week11Java.ex3;

import java.time.LocalTime;

public interface TimeCases {
    String getTimeAsString(LocalTime time);

    Boolean isRightCase(LocalTime time);
}
