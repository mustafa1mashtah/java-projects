package weektest5.Ex1.Ex6;


import java.util.Arrays;
import java.util.List;

public class WardrobeBuilder {
   private List<Step>steps=getSteps();

    private List<Step> getSteps() {
        return Arrays.asList(
                new AddBottom(),new AddSide(),new AddSide(),new AddBack(),new AddTop(),new AddShelf(),new AddShelf(),
                new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),new AddDoor(),
                new AddDoor()
        );
    }

    public  Wardrobe build(){
        Wardrobe wardrobe=new Wardrobe();
        for (Step step : steps) {
            step.perform(wardrobe);
        }
        return wardrobe;
    }



}
