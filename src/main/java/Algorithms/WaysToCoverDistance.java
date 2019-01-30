package Algorithms;

public class WaysToCoverDistance {

    /**
     * Returns number of ways for covering given distance.
     *
     * @param   distance    distance to cover
     * @return              number of possible ways to cover the distance
     * @author              Oleh Volchkov
     */
    public static int calculateWays(int distance) {

        if (distance < 0)
            return 0;
        if (distance == 0)
            return 1;

        return calculateWays(distance - 1) +
                calculateWays(distance - 2) +
                calculateWays(distance - 3);
    }
}