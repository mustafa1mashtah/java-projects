import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        String sentence = "PLEASE NO ADVERTISEMENT";
        sentence = sentence.toLowerCase();
        System.out.println(sentence);
        List<String> words = new ArrayList<>();
        words.add("PLEASE");
        words.add("NO");
        words.add("ADVERTISEMENT");
        List<String> Newwords = makeItLawerCase(words);
        System.out.println(Newwords);



    }


    public static List <String> makeItLawerCase(List<String> words){

        List<String> Newwords = new ArrayList<>();
        for (String name:words) {
            name = name.toLowerCase();
            Newwords.add(name);


        }

        return Newwords;

    }




}
