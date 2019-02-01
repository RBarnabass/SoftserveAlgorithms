package algorithms;

import java.util.Arrays;
import java.util.Random;


public class BucketSortTest {

   /* private BucketSort bucketSort;
    private int[] testArray;
    private int[] expected;

    @Before public void initTest() {
        bucketSort = new BucketSort();
    }
    @After public void afterTest() {
        bucketSort = null;
    }

    @Test public void nullTest() {
        assertNull(bucketSort.bucketSort(null));
    }
    @Test public void zeroElementsTest() {
        testArray = new int[] {};
        assertEquals(testArray, bucketSort.bucketSort(testArray));
    }
    @Test public void oneElementTest() {
        testArray = new int[] {7};
        assertEquals(testArray, bucketSort.bucketSort(testArray));
    }

    @Test public void twoElementsTest() {
        testArray = new int[] {1, 0};
        expected = new int[] {0, 1};
        assertArrayEquals(expected, bucketSort.bucketSort(testArray));
    }
    @Test public void severalElementsTest() {
        testArray = new int[] {72, 0, 57, 9, -1, 91, 108, -7, 25, 40};
        expected = new int[] {-7, -1, 0, 9, 25, 40, 57, 72, 91, 108};
        assertArrayEquals(expected, bucketSort.bucketSort(testArray));
    }
    @Test public void severalOnlyNegativeElementsTest() {
        testArray = new int[] {-72, -0, -57, -9, -1, -91, -108, -7, -25, -40};
        expected = new int[] {-108, -91, -72, -57, -40, -25, -9, -7, -1, -0};
        assertArrayEquals(expected, bucketSort.bucketSort(testArray));
    }

    @Test public void thousandElementsTest() {
        testArray = getRandomMass(1000);
        expected = testArray.clone();
        Arrays.sort(expected);
        assertArrayEquals(expected, bucketSort.bucketSort(testArray));
    }
    @Test public void hundredThousandElementsTest() {
        testArray = getRandomMass(100_000);
        expected = testArray.clone();
        Arrays.sort(expected);
        assertArrayEquals(expected, bucketSort.bucketSort(testArray));
    }


    @Test public void millionElementsTest() {
        testArray = getRandomMass(1_000_000);
        expected = testArray.clone();
        Arrays.sort(expected);
        assertArrayEquals(expected, bucketSort.bucketSort(testArray));
    }
    @Test public void twoMillionsElementsTest() {
        testArray = getRandomMass(2_000_000);
        expected = testArray.clone();
        Arrays.sort(expected);
        assertArrayEquals(expected, bucketSort.bucketSort(testArray));
    }

    @Test public void fiveMillionsElementsTest() {
        testArray = getRandomMass(5_000_000);
        expected = testArray.clone();
        Arrays.sort(expected);
        assertArrayEquals(expected, bucketSort.bucketSort(testArray));
    }

    private int[] getRandomMass(int quantity) {
        Random random = new Random();
        int[] arr = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            arr[i] = random.nextInt(Integer.MAX_VALUE);
        }
        return arr;
    }*/
}
