package week9java.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    Caesar caesar=new Caesar();

    @Test
    void TestCipher() {
        String cipherText = caesar.cipher("mN $jz", -1);
        String expected ="oP $lb";
        Assertions.assertEquals(expected,cipherText);

    }
}