package week7java.ex6;

import java.util.Arrays;
import java.util.List;

public class getListOfSecretHandShake {

    public static List<SecretHandshake> getSecretHandshakesList(String string) {
        List<SecretHandshake> secretHandshakes = Arrays.asList(new TheThumbTouchesBack(string),
                new TheTicklesOverPalm(string), new TheBroKnock(string), new TheThousandKnuckles(string));
        return secretHandshakes;


    }

}
