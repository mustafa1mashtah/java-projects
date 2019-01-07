package week8java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HashAndRemoveRobomimeTest {
    Decryption hashAndRemoveRobomime = new HashAndRemoveRobomime();

    @Test
    void TestDecrypt() {

        Assertions.assertEquals("moustafa",hashAndRemoveRobomime.decrypt("mou##strobomimea##f#a"));
    }
    @Test
    void TestisDecrypted() {

        Assertions.assertTrue(hashAndRemoveRobomime.isDecrypted("m#ous##taf#a"));
    }
}