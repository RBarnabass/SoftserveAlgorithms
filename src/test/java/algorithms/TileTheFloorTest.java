package algorithms;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;


class TileTheFloorTest {

    @Test
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

        TileTheFloor tileTheFloor = new TileTheFloor();

        assertEquals(numOfWays1, tileTheFloor.countWays(n1, m1));
        assertEquals(numOfWays2, tileTheFloor.countWays(n2, m2));
        assertEquals(numOfWays3, tileTheFloor.countWays(n3, m3));
        assertEquals(numOfWays4, tileTheFloor.countWays(n4, m4));
    }

    @Test
    void inputMismatchTest(){
        int n = -1;
        int m = -4;
        TileTheFloor tileTheFloor = new TileTheFloor();
        assertThrows(InputMismatchException.class, () -> tileTheFloor.countWays(n, m));
    }

    @Test
    void arrayOutOfBound(){
        TileTheFloor tileTheFloor = new TileTheFloor();
        int n = -1;
        int m= -4;
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> tileTheFloor.countWays(n, m));
    }
}
