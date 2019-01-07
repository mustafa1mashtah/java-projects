package week8java;

public class RemoveExclamationMark implements Decryption {
    @Override
    public Boolean isDecrypted(String line) {
        if (line.contains("!")){
            return true;
        }

        return false;
    }

    @Override
    public String decrypt(String line) {
        String lineWithoutExclamationMark = line.replaceAll("!", "");
        return lineWithoutExclamationMark;
    }
}
