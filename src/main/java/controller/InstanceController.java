package controller;

import algorithms.*;
import strategy.IAlgorithmStrategy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * This class initialize requirement algorithm and hold it by a constant time.
 *
 * @author Roman Berezhnov
 */
public class InstanceController implements InstanceManager {

    /**
     * This map holds all algorithms
     */
    private static final Map<Algorithm, IAlgorithmStrategy> algorithms = new HashMap<>();

    /**
     * This map holds algorithm name and time of its last use.
     */
    private final Map<Algorithm, Long> timer = new HashMap<>();

    /**
     * The constant time of algorithm instance life.
     */
    private static final long INSTANCE_LIFE_TIME = 10_000;

    /**
     * Variable hold requirement strategy.
     */
    private IAlgorithmStrategy strategy;

    /**
     * This is a constructor witch starts init method.
     */
    public InstanceController() {
        //init();
    }

    /**
     * This is getAlgorithm method for algorithm map.
     *
     * @param name enum field.
     * @return    algorithm instance.
     */
    public IAlgorithmStrategy getAlgorithm(Algorithm name) {

        checker(name);
        return algorithms.get(name) != null ? algorithms.get(name) : intellijInitialize(name);
    }

    /**
     * This method return instance of an algorithm by name.
     *
     * @param algorithmName algorithm name.
     * @return              instance of algorithm
     */
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
                strategy = new LongestSubSequence();
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
                strategy = new WaysToSumToN();
                break;
            }
            case OPTIMIZED_PAINTING_FENCE: {
                strategy = new OptimizedPaintingFence();
                break;
            }
        }

        algorithms.put(algorithmName, strategy);
        return strategy;
    }

    /**
     * This method checks lifetime of existence algorithm instances
     * and removes them if they had been used for a long time.
     *
     * @param name algorithm name.
     */
    private void checker(Algorithm name) {

        long instanceLifeTime;

        for (int i = 1; i < Algorithm.values().length; i++) {

            Algorithm algorithm = Algorithm.getAlgorithmName(i);

            if (timer.containsKey(algorithm) && !name.equals(algorithm)) {

                instanceLifeTime = new Date().getTime() - timer.get(algorithm);

                if (instanceLifeTime > INSTANCE_LIFE_TIME) {

                    algorithms.remove(algorithm);
                    timer.remove(algorithm);
                    System.out.println(" --- Removed - " + algorithm + " instance!");
                }

            } else if (name.equals(algorithm)) {

                timer.put(algorithm, new Date().getTime());
            }
        }
    }
}
