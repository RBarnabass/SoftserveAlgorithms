package controller;

import algorithms.*;
import strategy.IAlgorithmStrategy;
import java.util.HashMap;
import java.util.Map;

/**
 * This class initialize all algorithms and hold them all the time.
 *
 * @author Roman Berezhnov
 */
public class InstanceCreator implements InstanceManager {

    /**
     * Map that contain all algorithms
     */
    private static final Map<Algorithm, IAlgorithmStrategy> algorithms = new HashMap<>();

    /**
     * This is a constructor witch starts init method.
     */
     InstanceCreator() {
        init();
    }

    /**
     * This is getAlgorithm method for algorithm map.
     *
     * @param name enum field.
     * @return    algorithm instance.
     */
    public IAlgorithmStrategy getAlgorithm(Algorithm name) {

        return algorithms.get(name);
    }

    /**
     * Provide initialization for all algorithms.
     */
    private void init() {

        algorithms.put(Algorithm.BUCKET_SORT, new BucketSort());
        algorithms.put(Algorithm.COUNT_WAYS_OF_SUM, new CountWaysOfSum());
        algorithms.put(Algorithm.COUNTING_SORT, new CoutingSort());
        algorithms.put(Algorithm.FIBONACCI, new Fibonacci());
        algorithms.put(Algorithm.FRIEND_PAIRS, new FriendPairs());
        algorithms.put(Algorithm.HIGH_LOW_EFFORTS, new HighLowEfforts());
        algorithms.put(Algorithm.INSERTION_SORTS, new InsertionSort());
        algorithms.put(Algorithm.INTERESTING_ROW, new InterestingRow());
        algorithms.put(Algorithm.LONGEST_SUB_SEQUENCE, new LongestSubSequence());
        algorithms.put(Algorithm.MERGE_SORT, new MergeSort());
        algorithms.put(Algorithm.MODIFICATION_FIBONACCI, new ModificationFibonacci());
        algorithms.put(Algorithm.OPTIMIZED_PAINTING_FENCE, new OptimizedPaintingFence());
        algorithms.put(Algorithm.PAINTING_THE_FENCE, new PaintingTheFence());
        algorithms.put(Algorithm.PALINDROME, new Palindrome());
        algorithms.put(Algorithm.PATHS_WITHOUT_CROSSING, new PathsWithoutCrossing());
        algorithms.put(Algorithm.QUICK_SORT, new QuickSort());
        algorithms.put(Algorithm.TILE_THE_FLOOR, new TileTheFloor());
        algorithms.put(Algorithm.WAYS_TO_COVER_DISTANCE, new WaysToCoverDistance());
        algorithms.put(Algorithm.WAYS_TO_SUM_TO_N, new WaysToSumToN());
    }
}
