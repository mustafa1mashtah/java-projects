package week8java;

public class HashAndRemoveRobomime implements Decryption {
    @Override
    public Boolean isDecrypted(String line) {
        if (line.contains("#")){
            return true;
        }

        return false;
    }
    @Override
    public String decrypt(String line) {
        String removedHash = line.replaceAll("#", "");
        String removedRobomime = removedHash.replaceAll("robomime", "");
        return removedRobomime;
    }
}
