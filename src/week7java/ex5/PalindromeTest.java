package week7java.ex5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome palindrome=new Palindrome();

    @Test
    void testWord() {

        Assertions.assertTrue(palindrome.isPalindrome("mad am"));
    }
}