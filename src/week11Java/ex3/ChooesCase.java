package week11Java.ex3;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;


public class ChooesCase {
    private List<TimeCases> timeCases = Arrays.asList(new AfterThirty(), new BeforThirty(), new isThirty(), new ZeroMinutes());

    public void toWord(LocalTime time) {
         timeCases.stream().filter(e -> e.isRightCase(time))
                .map(e -> e.getTimeAsString(time))
                .forEach(e-> System.out.println(e));

    }

}
