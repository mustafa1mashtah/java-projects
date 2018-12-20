package week7java.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecretHandshakeMovesTranslator {
    static List<String> handShakes = new ArrayList<>();


    public List<String> getSecretHandshakeMoves(Integer price) {
        List<String> digits = getPriceDigits(price);
        for (String digit : digits) {
            Optional<SecretHandshake> secretHandshake = getTHeDigitHandshake(digit);
            if (secretHandshake.isPresent()) {
                handShakes.add(secretHandshake.get().getName());

            }


        }
        return handShakes;

    }

    private Optional<SecretHandshake> getTHeDigitHandshake(String digit) {
        List<SecretHandshake> secretHandshakes = Arrays.asList(new TheThumbTouchesBack(digit),
                new TheTicklesOverPalm(digit), new TheBroKnock(digit), new TheThousandKnuckles(digit));
        for (SecretHandshake secretHandshake : secretHandshakes) {
            if (secretHandshake.isHandshakeTHere(digit)) {
                return Optional.of(secretHandshake);
            }


        }
        return Optional.empty();


    }

    private List<String> getPriceDigits(Integer price) {
        String priceAsString = price.toString();
        List<String> digits = Arrays.asList(priceAsString.split(""));
        return digits;
    }


}
