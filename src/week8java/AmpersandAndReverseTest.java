package week8java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmpersandAndReverseTest {
    Decryption ampersandAndReverse = new AmpersandAndReverse();

    @Test
    void TestDecrypt() {
        Assertions.assertEquals("afatsuom", ampersandAndReverse.decrypt("m&ous&&taf&a"));
    }

    @Test
    void TestisDecrypted() {

        Assertions.assertTrue(ampersandAndReverse.isDecrypted("m&ous&&taf&a"));
    }
}