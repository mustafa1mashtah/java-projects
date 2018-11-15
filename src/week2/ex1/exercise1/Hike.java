package week2.ex1.exercise1;


import week2.ex2.gather.GathererAgent;

import java.util.ArrayList;
import java.util.List;

public class Hike {

    private List<Hiker> hikers =new ArrayList<>();

    public void signUp() {


        GathererAgent gathererAgent = new GathererAgent();
        hikers.addAll(gathererAgent.signUp());

    }
    public void showHikers(){

        for (Hiker hiker:hikers
             ) {
            System.out.println(hiker.getName());

        }



    }


}
