import algorithms.TileTheFloor;

import static org.junit.jupiter.api.Assertions.*;


class TileTheFloorTest {

    @org.junit.jupiter.api.Test
    void tileTheFloor() {

        int n1 = 4;
        int m1 = 6;
        int numOfWays1 = 1;

        int n2 = 3;
        int m2 = 2;
        int numOfWays2 = 3;

        int n3 = 10;
        int m3 = 4;
        int numOfWays3 = 14;

        int n4 = 7;
        int m4 = 4;
        int numOfWays4 = 5;

        assertEquals(numOfWays1, TileTheFloor.countWays(n1, m1));
        assertEquals(numOfWays2, TileTheFloor.countWays(n2, m2));
        assertEquals(numOfWays3, TileTheFloor.countWays(n3, m3));
        assertEquals(numOfWays4, TileTheFloor.countWays(n4, m4));
    }

}
