package week7java.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NicknamesGeneratorTest {
    NicknamesGenerator nicknamesGenerator = new NicknamesGenerator();

    @Test
    void testNoLetters() {
        Assertions.assertEquals(Optional.empty(), nicknamesGenerator.getNickname(""));

    }

    @Test
    void testOneLetter() {
        String name = "m";
        Assertions.assertEquals("m", nicknamesGenerator.getNickname(name).get());

    }

    @Test
    void testMoreThanOneLetter() {
        String name = "moustafa";
        Assertions.assertEquals("mous", nicknamesGenerator.getNickname(name).get());

    }
}