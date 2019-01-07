package week8java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sensor {
    private List<Decryption> decryptionList = Arrays.asList(new RemoveExclamationMark(),
            new AmpersandAndReverse(), new HashAndRemoveRobomime());

    public Optional<String> decryptOneLine(String line) {
        for (Decryption decryption : decryptionList) {
            if (decryption.isDecrypted(line)) {
                String decrypted = decryption.decrypt(line);
                return Optional.of(decrypted);

            }

        }
        return Optional.empty();


    }
    public  List<String> getTricksList() {
        List<String> tricksList = new ArrayList<>();
        ReadingRobomime readingRobomime = new ReadingRobomime();
        List<String> lines = readingRobomime.getLines();
        for (String line : lines) {
            Optional<String> decrypted = decryptOneLine(line);
            tricksList.add(decrypted.get());

        }
        return tricksList;
    }



}


