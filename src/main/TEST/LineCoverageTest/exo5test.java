
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class exo5test {

    @Test
    void testValidConversion() {
        assertEquals("X", RomanNumeral.toRoman(10));
    }

    @Test
    void testMultipleSymbols() {
        assertEquals("XLII", RomanNumeral.toRoman(42));
    }

    @Test
    void testLowerBound() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
    }

    @Test
    void testUpperBound() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }
}
