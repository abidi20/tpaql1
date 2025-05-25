
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class exo2tst {

    @Test
    void testAnagramTrue() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    @Test
    void testAnagramFalse() {
        assertFalse(Anagram.isAnagram("chien", "chat"));
    }

    @Test
    void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("abc", "abcd"));
    }

    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "abc"));
    }
}
