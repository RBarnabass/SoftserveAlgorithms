package controller;

import algorithms.*;
import strategy.IAlgorithmStrategy;

import javax.swing.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * This class initialize all algorithms.
 *
 * @version 1.0
 * @author Roman Berezhnov
 */
public class Initializer {

    /**
     * This map holds all algorithms
     */
    private static final Map<Algorithm, IAlgorithmStrategy> algorithms = new HashMap<>();
    private final Map<Algorithm, Long> timer = new HashMap<>();
    private IAlgorithmStrategy strategy;

    /**
     * This is a constructor witch starts init method.
     */
    public Initializer() {
        //init();
    }

    /**
     * This is getAlgorithm method for algorithm map.
     *
     * @param key enum field.
     * @return    algorithm instance.
     */
    public IAlgorithmStrategy getAlgorithm(Algorithm key) {

        checker(key);
        //return algorithms.get(key);
        return algorithms.get(key) != null ? algorithms.get(key) : intellijInitialize(key);
    }

    /**
     * This method provide initialization for all algorithms.
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
        algorithms.put(Algorithm.LONGEST_SUB_SEQUENCE, new LongestSubSequenceWithDifferenceOne());
        algorithms.put(Algorithm.MERGE_SORT, new MergeSort());
        algorithms.put(Algorithm.MODIFICATION_FIBONACCI, new ModificationFibonacci());
        algorithms.put(Algorithm.OPTIMIZED_PAINTING_FENCE, new OptimizedPaintingFence());
        algorithms.put(Algorithm.PAINTING_THE_FENCE, new PaintingTheFence());
        algorithms.put(Algorithm.PALINDROME, new Palindrome());
        algorithms.put(Algorithm.PATHS_WITHOUT_CROSSING, new PathsWithoutCrossing());
        algorithms.put(Algorithm.QUICK_SORT, new QuickSort());
        algorithms.put(Algorithm.TILE_THE_FLOOR, new TileTheFloor());
        algorithms.put(Algorithm.WAYS_TO_COVER_DISTANCE, new WaysToCoverDistance());
        algorithms.put(Algorithm.WAYS_TO_SUM_TO_N, new WaysToSumToNUsingArrayElementsWithRepetition());
    }

    private IAlgorithmStrategy intellijInitialize(Algorithm algorithmName) {

        switch (algorithmName) {

            case BUCKET_SORT: {
                strategy = new BucketSort();
                break;
            }
            case COUNT_WAYS_OF_SUM: {
                strategy = new CountWaysOfSum();
                break;
            }
            case COUNTING_SORT: {
                strategy = new CoutingSort();
                break;
            }
            case FIBONACCI: {
                strategy = new Fibonacci();
                break;
            }
            case FRIEND_PAIRS: {
                strategy = new FriendPairs();
                break;
            }
            case HIGH_LOW_EFFORTS: {
                strategy = new HighLowEfforts();
                break;
            }
            case INSERTION_SORTS: {
                strategy = new InsertionSort();
                break;
            }
            case INTERESTING_ROW: {
                strategy = new InterestingRow();
                break;
            }
            case LONGEST_SUB_SEQUENCE: {
                strategy = new LongestSubSequenceWithDifferenceOne();
                break;
            }
            case MERGE_SORT: {
                strategy = new MergeSort();
                break;
            }
            case MODIFICATION_FIBONACCI: {
                strategy = new ModificationFibonacci();
                break;
            }
            case PAINTING_THE_FENCE: {
                strategy = new PaintingTheFence();
                break;
            }
            case PALINDROME: {
                strategy = new Palindrome();
                break;
            }
            case PATHS_WITHOUT_CROSSING: {
                strategy = new PathsWithoutCrossing();
                break;
            }
            case QUICK_SORT: {
                strategy = new QuickSort();
                break;
            }
            case TILE_THE_FLOOR: {
                strategy = new TileTheFloor();
                break;
            }
            case WAYS_TO_COVER_DISTANCE: {
                strategy = new WaysToCoverDistance();
                break;
            }
            case WAYS_TO_SUM_TO_N: {
                strategy = new WaysToSumToNUsingArrayElementsWithRepetition();
                break;
            }
            case OPTIMIZED_PAINTING_FENCE: {
                strategy = new OptimizedPaintingFence();
                break;
            }
        }

        timer.put(algorithmName, new Date().getTime());
        algorithms.put(algorithmName, strategy);
        return strategy;
    }

    private void checker(Algorithm name) {

        long k;
        for (int i = 1; i < Algorithm.values().length; i++) {

            Algorithm algorithm = Algorithm.getAlgorithmName(i);

            if (timer.containsKey(algorithm) && !name.equals(algorithm)) {

                k = new Date().getTime() - timer.get(algorithm);
                System.out.println(" --- time - " + k);

                if (k > 10000) {
                    algorithms.remove(algorithm);
                    System.out.println(" --- Removed - " + algorithm + " instance!");
                }
            }
        }
    }
}
