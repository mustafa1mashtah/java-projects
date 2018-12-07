package weektest5.Ex1.Ex7;

import java.util.Arrays;
import java.util.List;

public class moves {
    private static List<move> moveList = Arrays.asList(new rock(), new paper(), new scissors());

    public static List<move> asList() {


        return moveList;
    }


}
