
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exo3Test {

    @Test
    void testFound() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2, BinarySearch.binarySearch(array, 3)); // if (==) branch
    }

    @Test
    void testGoLeft() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(-1, BinarySearch.binarySearch(array, 0)); // else -> high = mid - 1
    }

    @Test
    void testGoRight() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(-1, BinarySearch.binarySearch(array, 6)); // else if -> low = mid + 1
    }

    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 1));
    }
}
