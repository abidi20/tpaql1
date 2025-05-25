import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo1Teste {

    @Test
    void testTrueConditions() {
        assertTrue(Palindrome.isPalindrome("kayak")); // i < j : true, charAt(i) == charAt(j) : true
    }

    @Test
    void testFalseConditionInLoop() {
        assertFalse(Palindrome.isPalindrome("kayaks")); // charAt(i) != charAt(j) : true
    }

    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    void testShortPalindrome() {
        assertTrue(Palindrome.isPalindrome("aa")); // i < j : true, charAt(i) == charAt(j)
    }

    @Test
    void testSingleCharacter() {
        assertTrue(Palindrome.isPalindrome("a")); // i < j : false (never enters loop)
    }
}