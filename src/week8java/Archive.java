package week8java;

import java.util.HashSet;
import java.util.List;

public class Archive {
    public void getTricksInfo(List<String> repeatedTricks) {
        HashSet<String> tricks = new HashSet<>(repeatedTricks);


        int numberOfUniqueTricks = tricks.size();
        System.out.println("Number of unique tricks: " + numberOfUniqueTricks);
        System.out.println("Tricks: " + tricks);


    }


}
