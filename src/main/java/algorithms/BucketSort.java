package algorithms;

import strategy.IAlgorithmStrategy;

import java.util.*;

import static utilities.Util.userInputArray;

/**
 * This class is designed for sorting an integer array by bucket method.
 *
 * @author Roman Berezhnov
 * @version 1.0
 */
public class BucketSort implements IAlgorithmStrategy {

    /**
     * The smallest element of the array.
     */
    private int min;

    /**
     * The biggest element of the array.
     */
    private int max;

    /**
     * Returns sorted array.
     *
     * @param array array of integers.
     * @return sorted array.
     */
    int[] bucketSort(int[] array) {

        if (array == null
                || array.length == 0
                || array.length == 1) {
            return array;
        }

        minMaxInitialization(array);
        Bucket[] buckets = assignToBuckets(new Bucket[array.length], array);
        sortUsedBuckets(buckets);
        return buildResult(buckets, array.length);
    }

    /**
     * Searching for minimum and maximum value and initializing them.
     *
     * @param array array of integers.
     */
    private void minMaxInitialization(int[] array) {

        for (int currentElement : array) {
            if (currentElement > max) {
                max = currentElement;
            } else if (currentElement < min) {
                min = currentElement;
            }
        }
    }

    /**
     * Spreads out array elements to the buckets.
     *
     * @param buckets arrays for holding presorting elements.
     * @param array   array of integers.
     * @return buckets with presorting elements.
     */
    private Bucket[] assignToBuckets(Bucket[] buckets, int[] array) {

        int bucketIndex;
        int countUsedBuckets = 0;
        for (int currentIndex : array) {
            bucketIndex = getBucketIndex(currentIndex, array.length);
            if (buckets[bucketIndex] != null) {
                buckets[bucketIndex].list.add(currentIndex);
            } else {
                buckets[bucketIndex] = new Bucket();
                buckets[bucketIndex].list.add(currentIndex);
                countUsedBuckets++;
            }
        }
        return deleteEmptyBuckets(buckets, countUsedBuckets);
    }
//TODO

    /**
     * Sorts buckets elements.
     *
     * @param buckets arrays for holding presorting elements.
     */
    private void sortUsedBuckets(Bucket[] buckets) {

        for (Bucket currentBucket : buckets) {
            if (currentBucket.list.size() > 1) {
                Collections.sort(currentBucket.list);
            }
        }
    }

    /**
     * Builds result from all buckets to initial array.
     *
     * @param sortedBuckets arrays with sorted elements.
     * @param length        length of incoming array.
     * @return sorted array.
     */
    private int[] buildResult(Bucket[] sortedBuckets, int length) {
        int resultArrayIndex = 0;
        int[] resultArray = new int[length];
        for (Bucket bucket : sortedBuckets) {
            List<Integer> list = bucket.list;
            for (Integer currentElement : list) {
                resultArray[resultArrayIndex++] = currentElement;
            }
        }
        return resultArray;
    }

    /**
     * Counts special coefficient which defines a number of presorting bucked.
     *
     * @param current current element from an unsorted array.
     * @param length  length of unsorted array.
     * @return coefficient for presorting.
     */
    private int getBucketIndex(int current, int length) {

        double denominator = max - min + 1;
        double factor = (current - min) / denominator;
        return (int) (factor * length);
    }

    /**
     * Deletes all buckets which weren't used.
     *
     * @param buckets          arrays for holding presorting elements.
     * @param countUsedBuckets number of used buckets.
     * @return buckets array.
     */
    private Bucket[] deleteEmptyBuckets(Bucket[] buckets, int countUsedBuckets) {

        Bucket[] rebuttedBuckets = new Bucket[countUsedBuckets];
        int rebuttedBucketIndex = 0;
        for (Bucket bucket : buckets) {
            if (bucket != null) {
                rebuttedBuckets[rebuttedBucketIndex++] = bucket;
            }
        }
        return rebuttedBuckets;
    }

    /**
     * Runner method for execution of algorithm.
     */
    @Override
    public void execute() {

        int[] array = userInputArray();
        System.out.println("Sorted array - " + Arrays.toString(bucketSort(array)) + "\n");
    }

    /**
     * This inner class is some entity wrapper for ArrayList.
     */
    private class Bucket {

        List<Integer> list = new ArrayList<>();
    }
}
