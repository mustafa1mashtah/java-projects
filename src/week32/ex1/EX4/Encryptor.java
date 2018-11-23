package week32.ex1.EX4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Encryptor {


    public String encrypt(String message) {
        Random random = new Random();
        String[] letters = message.split("");
        List<String> letters2 =new ArrayList<>(Arrays.asList(letters));




        message = message.replaceAll("A", "4");
        message = message.replaceAll("a", "4");
        message = message.replaceAll("E", "3");
        message = message.replaceAll("e", "3");
        message = message.replaceAll("I", "2");
        message = message.replaceAll("i", "2");
        message = message.replaceAll("O", "8");
        message = message.replaceAll("o", "8");
        message = message.replaceAll("U", "9");
        message = message.replaceAll("u", "9");


        String symbols = "!@#$%&*+-";

        List<String> newLetter = new ArrayList<>();
        for (String letter : letters2
        ) {
            newLetter.add(letter);
            int randomNumber = random.nextInt(5);
            randomNumber++;
            String partOfSymbols = symbols.substring(1, randomNumber);
            newLetter.add(partOfSymbols);


        }
        String newMessage = "";
        for (String letter : newLetter
        ) {
            newMessage = newMessage + letter;

        }


        return newMessage;


    }


}
//They will never write numbers as numbers in their messages.
// Instead they will write the word for the numbers.
// So if they want to write 5, they will write five instead.
//They will never use mathematical symbols.
// Instead they will also write the proper names of those symbols.
//They are allowed to use the punctuation symbols comma and dot. The rest are not allowed.
//When they write a message, the vowels will be replaced so:
//A and a become a 4.
//E and e become a 3.
//I and i become a 1.
//O and o become a 8.
//U and u become a 9.
//After the replacement has taken place,
// the message will be encrypted by adding a random number (from 1 to 5) of rubbish symbols between all letters.
// The rubbish symbols can be chosen among: !@#$%&*+-=