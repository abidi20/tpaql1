
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo6Teste {

    @Test
    void testFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9)); // n % 3 == 0
    }

    @Test
    void testBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10)); // n % 5 == 0
    }

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15)); // n % 15 == 0
    }

    @Test
    void testOtherNumber() {
        assertEquals("7", FizzBuzz.fizzBuzz(7)); // nothing matches
    }

    @Test
    void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(-1));
    }
}
