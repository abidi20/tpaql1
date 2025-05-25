
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exo6Test {

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15)); // %15 == 0
    }

    @Test
    void testFizzOnly() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9)); // %3 == 0
    }

    @Test
    void testBuzzOnly() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10)); // %5 == 0
    }

    @Test
    void testOther() {
        assertEquals("7", FizzBuzz.fizzBuzz(7)); // aucune condition
    }

    @Test
    void testInvalid() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0)); // n <= 0
    }
}
