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

/**
 * This class provides initialization for all algorithms and hold them all the time.
 *
 * @author Roman Berezhnov
 */
public class InstanceCreator implements InstanceManager {

    /**
     * Map that contain all algorithms.
     */
    private static final Map<AlgorithmName, IAlgorithmStrategy> algorithms = new HashMap<>();

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
    public IAlgorithmStrategy getAlgorithm(AlgorithmName name) {

        return algorithms.get(name);
    }

    /**
     * Provides initialization for all algorithms.
     */
    private void init() {

        algorithms.put(AlgorithmName.BUCKET_SORT, new BucketSort());
        algorithms.put(AlgorithmName.COUNT_WAYS_OF_SUM, new CountWaysOfSum());
        algorithms.put(AlgorithmName.COUNTING_SORT, new CountingSort());
        algorithms.put(AlgorithmName.FIBONACCI, new Fibonacci());
        algorithms.put(AlgorithmName.FRIEND_PAIRS, new FriendPairs());
        algorithms.put(AlgorithmName.HIGH_LOW_EFFORTS, new HighLowEfforts());
        algorithms.put(AlgorithmName.INSERTION_SORTS, new InsertionSort());
        algorithms.put(AlgorithmName.INTERESTING_ROW, new InterestingRow());
        algorithms.put(AlgorithmName.LONGEST_SUB_SEQUENCE, new LongestSubSequence());
        algorithms.put(AlgorithmName.MERGE_SORT, new MergeSort());
        algorithms.put(AlgorithmName.MODIFICATION_FIBONACCI, new ModificationFibonacci());
        algorithms.put(AlgorithmName.OPTIMIZED_PAINTING_FENCE, new OptimizedPaintingFence());
        algorithms.put(AlgorithmName.PAINTING_THE_FENCE, new PaintingTheFence());
        algorithms.put(AlgorithmName.PALINDROME, new Palindrome());
        algorithms.put(AlgorithmName.PATHS_WITHOUT_CROSSING, new PathsWithoutCrossing());
        algorithms.put(AlgorithmName.QUICK_SORT, new QuickSort());
        algorithms.put(AlgorithmName.TILE_THE_FLOOR, new TileTheFloor());
        algorithms.put(AlgorithmName.WAYS_TO_COVER_DISTANCE, new WaysToCoverDistance());
        algorithms.put(AlgorithmName.WAYS_TO_SUM_TO_N, new WaysToSumToN());
    }
}
