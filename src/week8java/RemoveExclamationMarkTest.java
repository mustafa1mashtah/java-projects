package week8java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveExclamationMarkTest {
    Decryption removeExclamationMark = new RemoveExclamationMark();

    @Test
    void TestDecrypt() {

        Assertions.assertEquals("moustafa",removeExclamationMark.decrypt("m!ou!!stafa!"));
    }
    @Test
    void TestisDecrypted() {

        Assertions.assertTrue(removeExclamationMark.isDecrypted("m!ou!!stafa!"));
    }

}