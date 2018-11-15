package week2.ex2.gather;

import week2.ex1.exercise1.Hike;
import week2.ex1.exercise1.Hiker;

import java.util.ArrayList;
import java.util.List;

public class AutomaticGatherer {
    List<Hiker> getConfirmedHikers(){

        List<Hiker>hikers=new ArrayList<>();
        Hiker hiker=new Hiker("mustafa");
        hikers.add(hiker);

        hikers.add(hiker=new Hiker("mona"));

        hikers.add(hiker=new Hiker("ahmad"));

        hikers.add(hiker=new Hiker("johanna"));

        hikers.add(hiker=new Hiker("malek"));
        return hikers;

    }

}
