package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClimbingStairsTest {

    @Test
    void climbStairsTest(){
        var climbingStairs = new ClimbingStairs();
        int result  = climbingStairs.climb(2);

        Assertions.assertEquals(2, result);

        result = climbingStairs.climb(3);
        Assertions.assertEquals(3, result);

    }

}