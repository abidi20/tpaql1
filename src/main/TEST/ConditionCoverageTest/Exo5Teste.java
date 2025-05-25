import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo5Teste {

    @Test
    void testRomanExactMatches() {
        assertEquals("X", RomanNumeral.toRoman(10));
        assertEquals("IX", RomanNumeral.toRoman(9));
        assertEquals("MCMXCIV", RomanNumeral.toRoman(1994));
    }

    @Test
    void testInvalidInputLow() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
    }

    @Test
    void testInvalidInputHigh() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }
}
