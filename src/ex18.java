import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a word");
        String word=scanner.nextLine();
        String newWord= formatToBracketsCI(word);
        System.out.println(newWord);

    }
    public static String formatToBracketsCI(String word){
        Integer length = word.length();
        Integer  size = length-1;

        String firstLetter =word.substring(0,1);
        String lastLetter =word.substring( size);
        String section =word.substring(1, size);
        firstLetter=firstLetter.toUpperCase();
        lastLetter=lastLetter.toUpperCase();
        String newWord =firstLetter+section+lastLetter;
        return newWord;
    }
}
