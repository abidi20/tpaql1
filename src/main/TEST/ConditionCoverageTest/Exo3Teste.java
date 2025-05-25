
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo3Teste {

    @Test
    void testAllConditions() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2, BinarySearch.binarySearch(array, 3)); // array[mid] == element
        assertEquals(-1, BinarySearch.binarySearch(array, 0)); // array[mid] > element
        assertEquals(-1, BinarySearch.binarySearch(array, 6)); // array[mid] < element
    }

    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 1));
    }
}
