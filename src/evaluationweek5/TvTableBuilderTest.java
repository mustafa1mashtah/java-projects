package evaluationweek5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import weektest5.Ex1.Ex6.Step;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TvTableBuilderTest {
    List<String>parts=new ArrayList<>();

    TvTableBuilder tvTableBuilder=new TvTableBuilder();




    @Test
    void testBuilder() {
        parts.add("leg");
        parts.add("leg");
        parts.add("leg");
        parts.add("leg");
        parts.add("shelf");
        parts.add("top");
        int partsSize=parts.size();
        List<String>stepList=tvTableBuilder.build().getParts();
        Assertions.assertEquals(partsSize,stepList.size());
        Integer position=0;
        for (String part:parts) {
            String step=stepList.get(position);
            Assertions.assertEquals(part,step);
            position++;


        }







    }
}