
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo2Teste {

    @Test
    void testConditionTrueAndFalse() {
        assertTrue(Anagram.isAnagram("chien", "niche")); // s1.length == s2.length, all counts 0
    }

    @Test
    void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("abc", "ab")); // s1.length != s2.length
    }

    @Test
    void testNotAnagramWithCounts() {
        assertFalse(Anagram.isAnagram("abc", "abd")); // count != 0 at the end
    }

    @Test
    void testNullInputs() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "abc"));
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("abc", null));
    }
}
