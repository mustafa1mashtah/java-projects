package week11Java.ex2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ClockFormat {

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void main(String[] args) {
        toMilitaryTime("07:05:45PM");


    }

    public static void toMilitaryTime(String time) {
        LocalTime localTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("hh:mm:ssa"));
        System.out.println(localTime.format(formatter));
    }
}
