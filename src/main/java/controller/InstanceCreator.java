package controller;

import algorithms.BucketSort;
import algorithms.CountWaysOfSum;
import algorithms.CountingSort;
import algorithms.Fibonacci;
import algorithms.FriendPairs;
import algorithms.HighLowEfforts;
import algorithms.InsertionSort;
import algorithms.InterestingRow;
import algorithms.LongestSubSequence;
import algorithms.MergeSort;
import algorithms.ModificationFibonacci;
import algorithms.OptimizedPaintingFence;
import algorithms.PaintingTheFence;
import algorithms.Palindrome;
import algorithms.PathsWithoutCrossing;
import algorithms.QuickSort;
import algorithms.TileTheFloor;
import algorithms.WaysToCoverDistance;
import algorithms.WaysToSumToN;
import strategy.IAlgorithmStrategy;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * This class provides initialization for all algorithms and hold them all the time.
 *
 * @author Roman Berezhnov
 */
public class InstanceCreator implements InstanceManager {

    /**
     * Map that contain all algorithms.
     */
    private static final Map<Algorithm, IAlgorithmStrategy> algorithms = new HashMap<>();

    /**
     * Constructor which starts init method.
     */
    InstanceCreator() {
        init();
    }

    /**
     * Method for getting algorithm map.
     *
     * @param name enum field.
     * @return    algorithm instance.
     */
    public IAlgorithmStrategy getAlgorithm(Algorithm name) {

        return algorithms.get(name);
    }

    /**
     * Provides initialization for all algorithms.
     */
    private void init() {

        final Scanner sc = new Scanner(System.in);

        algorithms.put(Algorithm.BUCKET_SORT, new BucketSort());
        algorithms.put(Algorithm.COUNT_WAYS_OF_SUM, new CountWaysOfSum(sc));
        algorithms.put(Algorithm.COUNTING_SORT, new CountingSort());
        algorithms.put(Algorithm.FIBONACCI, new Fibonacci(sc));
        algorithms.put(Algorithm.FRIEND_PAIRS, new FriendPairs(sc));
        algorithms.put(Algorithm.HIGH_LOW_EFFORTS, new HighLowEfforts(sc));
        algorithms.put(Algorithm.INSERTION_SORTS, new InsertionSort());
        algorithms.put(Algorithm.INTERESTING_ROW, new InterestingRow(sc));
        algorithms.put(Algorithm.LONGEST_SUB_SEQUENCE, new LongestSubSequence());
        algorithms.put(Algorithm.MERGE_SORT, new MergeSort());
        algorithms.put(Algorithm.MODIFICATION_FIBONACCI, new ModificationFibonacci(sc));
        algorithms.put(Algorithm.OPTIMIZED_PAINTING_FENCE, new OptimizedPaintingFence(sc));
        algorithms.put(Algorithm.PAINTING_THE_FENCE, new PaintingTheFence(sc));
        algorithms.put(Algorithm.PALINDROME, new Palindrome());
        algorithms.put(Algorithm.PATHS_WITHOUT_CROSSING, new PathsWithoutCrossing(sc));
        algorithms.put(Algorithm.QUICK_SORT, new QuickSort());
        algorithms.put(Algorithm.TILE_THE_FLOOR, new TileTheFloor(sc));
        algorithms.put(Algorithm.WAYS_TO_COVER_DISTANCE, new WaysToCoverDistance(sc));
        algorithms.put(Algorithm.WAYS_TO_SUM_TO_N, new WaysToSumToN(sc));
    }
}
