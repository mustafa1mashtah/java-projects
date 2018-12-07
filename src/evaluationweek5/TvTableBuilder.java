package evaluationweek5;

import weektest5.Ex1.Ex6.*;

import java.util.Arrays;
import java.util.List;

public class TvTableBuilder {
    private List<Step> steps=getSteps();

    private List<Step> getSteps() {
        return Arrays.asList(
                new AddLeg(),new  AddLeg(),new AddLeg(),new AddLeg(),
                new AddShelf(),new AddTop()

        );
    }

    public  TvTable build(){
        TvTable tvTable=new TvTable();
        for (Step step : steps) {
            step.perform(tvTable);
        }
        return tvTable;
    }



}
