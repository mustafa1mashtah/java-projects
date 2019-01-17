package week9java.ex3;


import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {

    private List<String> alphabetLetters = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));

    public String cipher(String plaintext, Integer key) {
        return Stream.of(plaintext.split(""))
                .map(e -> getTheCipherLetter(e, key))
                .collect(Collectors.joining());
    }


    private String getTheCipherLetter(String letter, Integer key) {
        char character = letter.charAt(0);
        if (!(Character.isAlphabetic(character))) {
            return letter;
        }
        if (Character.isLowerCase(character)) {
            return transformLetter(letter, key);
        }
        String transformedLetterInLowerCase = transformLetter(letter.toLowerCase(), key);
        return transformedLetterInLowerCase.toUpperCase();
    }

    private String transformLetter(String letter, Integer key) {
        int position = alphabetLetters.indexOf(letter);
        int newPosition = (position + key) % alphabetLetters.size();
        return alphabetLetters.get(newPosition);
    }


}
