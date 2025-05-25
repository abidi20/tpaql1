
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class exo1test {

    @Test
    void testPalindromeSimple() {
        assertTrue(Palindrome.isPalindrome("kayak"));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("bonjour"));
    }

    @Test
    void testPhraseAvecEspaces() {
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
    }

    @Test
    void testNull() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }
}

