package lt.gerasimovas.simple_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    private static ClimbingStairs climbingStairs;

    @Test
    void climbStairs2Stair() {
        int result = climbingStairs.climbStairs(2);
        assertEquals(2, result);
    }

    @Test
    void climbStairs3Stair() {
        int result = climbingStairs.climbStairs(3);
        assertEquals(3, result);
    }
}