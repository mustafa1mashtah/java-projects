package week8java;

import week3java.ex9.FileReader;

import java.util.List;

public class ReadingRobomime {
    private static FileReader fileReader=new FileReader();

    public static List<String>getLines(){
        List<String> lines = fileReader.getLines("week8java/robomime.txt");
        return lines;
    }
}
