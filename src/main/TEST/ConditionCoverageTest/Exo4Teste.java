
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo4Teste {

    @Test
    void testDeltaPositive() {
        double[] result = QuadraticEquation.solve(1, -3, 2); // delta > 0
        assertArrayEquals(new double[]{2.0, 1.0}, result, 0.001);
    }

    @Test
    void testDeltaZero() {
        double[] result = QuadraticEquation.solve(1, 2, 1); // delta == 0
        assertArrayEquals(new double[]{-1.0}, result, 0.001);
    }

    @Test
    void testDeltaNegative() {
        assertNull(QuadraticEquation.solve(1, 0, 1)); // delta < 0
    }

    @Test
    void testInvalidA() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 1, 1));
    }
}
