package algorithms;

import strategy.IAlgorithmStrategy;
import utilities.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * This class is designed for sorting an integer array by bucket method.
 * @version 1.0
 * @author Roman Berezhnov
 */
public class BucketSort implements IAlgorithmStrategy {

    private final Scanner scanner = new Scanner(System.in);

    /**
     * The smallest element of the array.
     */
    private int min;

    /**
     * The biggest element of the array.
     */
    private int max;

    /**
     * This method provide main sorting logic.
     * @param array this is the incoming array of integer unsorted numbers.
     * @return sorted array.
     */
    public int[] bucketSort(int[] array) {

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
     * This method is searching for minimum and maximum value.
     * And, initializes them.
     * @param array this is the incoming array of integer unsorted numbers.
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
     * This method spreads out array elements to the buckets.
     * @param buckets this is an arrays for holding presorting elements.
     * @param array   this is the incoming array of integer unsorted numbers.
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

    /**
     * This method sorts buckets elements.
     * @param buckets this is an arrays for holding presorting elements.
     */
    private void sortUsedBuckets(Bucket[] buckets) {
        for (Bucket currentBucket : buckets) {
            if (currentBucket.list.size() > 1) {
                Collections.sort(currentBucket.list);
            }
        }
    }

    /**
     * This method builds result from all buckets to initial array.
     * @param sortedBuckets this is an arrays with sorted elements.
     * @param length        this is the length of incoming array.
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
     * This method count special coefficient which defines a number of presorting bucked.
     * @param current this is the current element from an unsorted array.
     * @param length  this is the length of unsorted array.
     * @return coefficient for presorting
     */
    private int getBucketIndex(int current, int length) {
        double denominator = max - min + 1;
        double factor = (current - min) / denominator;
        return (int) (factor * length);
    }

    /**
     * This method deletes all buckets which weren't used.
     * @param buckets          this is an arrays for holding presorting elements.
     * @param countUsedBuckets this is number of used buckets.
     * @return used buckets array.
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

    @Override
    public void execute() {
        int[] array = util.writeArray();
        bucketSort(array);
    }

    /**
     * This inner class is some entity wrapper for ArrayList.
     */
    private class Bucket {
        List<Integer> list = new ArrayList<>();
    }
}
