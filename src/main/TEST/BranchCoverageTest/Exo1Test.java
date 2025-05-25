
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exo1Test {

    @Test
    void testPalindrome() {
        assertTrue(Palindrome.isPalindrome("kayak")); // if (charAt(i) != charAt(j)) == false
    }

    @Test
    void testNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello")); // if (charAt(i) != charAt(j)) == true
    }

    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }
}
