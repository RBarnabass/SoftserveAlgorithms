package controller;

/**
 * Enum with all algorithms.
 *
 * @version 1.0
 * @author Oleh Volchkov
 * @author Roman Berezhnov
 */
public enum Algorithm {

    EXIT,
    BUCKET_SORT,
    COUNT_WAYS_OF_SUM,
    COUNTING_SORT,
    FIBONACCI,
    FRIEND_PAIRS,
    HIGH_LOW_EFFORTS,
    INSERTION_SORTS,
    INTERESTING_ROW,
    LONGEST_SUB_SEQUENCE,
    MERGE_SORT,
    MODIFICATION_FIBONACCI,
    OPTIMIZED_PAINTING_FENCE,
    PAINTING_THE_FENCE,
    PALINDROME,
    PATHS_WITHOUT_CROSSING,
    QUICK_SORT,
    TILE_THE_FLOOR,
    WAYS_TO_COVER_DISTANCE,
    WAYS_TO_SUM_TO_N;

    /**
     * Returns Enum field.
     *
     * @param index index of enum field.
     * @return enum field.
     */
    public static Algorithm getAlgorithmName(int index) {

        for (Algorithm algorithms: Algorithm.values()) {
            if (index == (algorithms.ordinal())) {
                return algorithms;
            }
        }
        return EXIT;
    }
}
