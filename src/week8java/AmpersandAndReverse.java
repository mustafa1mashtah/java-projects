package week8java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AmpersandAndReverse implements Decryption{
    @Override
    public Boolean isDecrypted(String line) {
        if (line.contains("&")){
            return true;
        }

        return false;
    }
    @Override
    public String decrypt(String line) {
        String removedAmpersand = line.replaceAll("&", "");
        List<String> listOfRemovedAmpersand = Arrays.asList(removedAmpersand.split(""));
        Collections.reverse(listOfRemovedAmpersand);


        String reversedAndAmpersand = String.join("",listOfRemovedAmpersand);

        return reversedAndAmpersand;
    }
}
