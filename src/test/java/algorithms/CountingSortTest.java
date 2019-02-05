package algorithms;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountingSortTest {

    private static CountingSort countingSort;

    @BeforeAll
    public static void initCountingSort(){
        countingSort = new CountingSort();
    }
    @AfterAll
    public static void deleteCountingSort(){
        countingSort = null;
    }

    @org.junit.jupiter.api.Test
    public void countingSortTest() {

        int[] array = {5, 10,1005, 9, -10, 20, 45, -789};
        int[] expectedArray = {-789, -10, 5, 9, 10, 20, 45, 1005};
        assertArrayEquals(expectedArray, countingSort.countingSort(array));

    }
}