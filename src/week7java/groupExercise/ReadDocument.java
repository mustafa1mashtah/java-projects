package week7java.groupExercise;

import week3java.ex9.FileReader;

import java.util.ArrayList;
import java.util.List;

public class ReadDocument {

    public List<String> getNames() {
        FileReader fileReader=new FileReader();
        List<String>names=new ArrayList<>();
        List<String> lines = fileReader.getLines("week7java/groupExercise/participants.csv");
        for (String line : lines) {
            String toLowerCase = line.toLowerCase();
            names.add(toLowerCase);


        }
        return names;
    }
}
