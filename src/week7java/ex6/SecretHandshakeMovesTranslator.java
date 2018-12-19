package week7java.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecretHandshakeMovesTranslator {
    static List<String> handShakes = new ArrayList<>();


    public List<String> getSecretHandshakeMoves(Integer number) {

        List<String> numbers = Arrays.asList(number.toString().split(""));
        for (String string : numbers) {
            List<String> handShakeMove = getHandShakeMove(string);


        }
        return handShakes;
    }

    private List<String> getHandShakeMove(String string) {
        List<SecretHandshake> secretHandshakes = Arrays.asList(new TheThumbTouchesBack(string), new TheTicklesOverPalm(string), new TheBroKnock(string), new TheThousandKnuckles(string));
        for (SecretHandshake secretHandshake : secretHandshakes) {
            if (secretHandshake.isHandshakeTHere(string)) {
                handShakes.add(secretHandshake.getName());

            }
        }


        return handShakes;
    }


}
