
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exo5Test {

    @Test
    void testSimpleValue() {
        assertEquals("I", RomanNumeral.toRoman(1));
    }

    @Test
    void testSubtractiveNotation() {
        assertEquals("IV", RomanNumeral.toRoman(4));
    }

    @Test
    void testMultipleValues() {
        assertEquals("XLII", RomanNumeral.toRoman(42));
    }

    @Test
    void testInvalidLow() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
    }

    @Test
    void testInvalidHigh() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }
}
