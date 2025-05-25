
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class exo4test{

    @Test
    void testTwoSolutions() {
        double[] result = QuadraticEquation.solve(1, -3, 2);
        assertArrayEquals(new double[]{2.0, 1.0}, result, 0.001);
    }

    @Test
    void testOneSolution() {
        double[] result = QuadraticEquation.solve(1, -2, 1);
        assertArrayEquals(new double[]{1.0}, result, 0.001);
    }

    @Test
    void testNoSolution() {
        assertNull(QuadraticEquation.solve(1, 0, 1));
    }

    @Test
    void testInvalidA() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 2, 1));
    }
}
