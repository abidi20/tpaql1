

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exo2Test {

    @Test
    void testAnagramTrue() {
        assertTrue(Anagram.isAnagram("chien", "niche")); // toutes les branches vers true
    }

    @Test
    void testDifferentLength() {
        assertFalse(Anagram.isAnagram("abc", "abcd")); // s1.length != s2.length
    }

    @Test
    void testNotAnagram() {
        assertFalse(Anagram.isAnagram("chat", "chien")); // tableaux !=
    }

    @Test
    void testNullInputs() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "abc"));
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("abc", null));
    }
}
