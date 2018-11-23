package week32.ex1.EX4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Decryptor {
    public String decrypt(String message) {
        List<String> finalMessage = new ArrayList<>();
        String[] mesagees= message.split("");
        List<String> messages =new ArrayList<>(Arrays.asList(mesagees)) ;
        String symbol = "!@#$%&*+-";

        List<String> symbols =new ArrayList<>(Arrays.asList(symbol.split("")));
        for (String letter : messages
        ) {
            if (!(symbols.contains(letter))) {
                finalMessage.add(letter);

            }


        }
        String newMessage = "";
        for (String letter : finalMessage
        ) {
            newMessage = newMessage + letter;

        }
        newMessage = newMessage.replaceAll("4", "A");
        newMessage = newMessage.replaceAll("4", "a");
        newMessage = newMessage.replaceAll("3", "E");
        newMessage = newMessage.replaceAll("3", "e");
        newMessage = newMessage.replaceAll("2", "I");
        newMessage = newMessage.replaceAll("2", "i");
        newMessage = newMessage.replaceAll("8", "O");
        newMessage = newMessage.replaceAll("8", "o");
        newMessage = newMessage.replaceAll("9", "U");
        newMessage = newMessage.replaceAll("9", "u");

        return newMessage;


    }


}
//The Decryptor has no attributes.
// It has the decrypt method that receives a String and returns the decrypted version of it.