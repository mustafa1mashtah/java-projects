package week7java.ex5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {
    public Boolean isPalindrome(String word) {
        String wordWithoutSpaces = word.replaceAll(" ", "");
        List<String> letters = Arrays.asList(wordWithoutSpaces.split(""));
        Collections.reverse(letters);
        String palindromeWord = String.join("", letters);

        return wordWithoutSpaces.equals(palindromeWord);
    }
}
