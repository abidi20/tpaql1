
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class exo3test {

    @Test
    void testElementFound() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2, BinarySearch.binarySearch(array, 3));
    }

    @Test
    void testElementNotFound() {
        int[] array = {1, 2, 4, 5};
        assertEquals(-1, BinarySearch.binarySearch(array, 3));
    }

    @Test
    void testEmptyArray() {
        int[] array = {};
        assertEquals(-1, BinarySearch.binarySearch(array, 1));
    }

    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 1));
    }
}
