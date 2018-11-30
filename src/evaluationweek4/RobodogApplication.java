package evaluationweek4;

import week3java.ex9.FileReader;

import java.util.*;

public class RobodogApplication {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        List<String> decrypted = ReadFile(fileReader);
        String allInstruction = "";
        for (String string : decrypted) {
            allInstruction += string;
        }
        String[] split = allInstruction.split(" ");
        //List<String> allInstructions = new ArrayList<>(Arrays.asList(split));
        Set<String>allInstructions=new HashSet<>(Arrays.asList(split));
        System.out.println(allInstructions);
        System.out.println("the number of instrutions the robodog can do: " + allInstructions.size());






        Map<String,Integer>improvedInstructions=new HashMap<>();
        for (String string:allInstructions) {


        }


    }

    private static List<String> ReadFile(FileReader fileReader) {
        List<String> lines = fileReader.getLines("evaluationweek4/robodog.txt");
        List<String> decrypted = new ArrayList<>();
        for (String line : lines) {
            String[] split = line.split("!");
            List<String> data = new ArrayList<>(Arrays.asList(split));

            for (String string : data) {
                if (!string.equals("")) {
                    decrypted.add(string);

                }

            }

        }
        return decrypted;


    }
}
