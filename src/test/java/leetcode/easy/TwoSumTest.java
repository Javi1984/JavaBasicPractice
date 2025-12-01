package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void TwoSumSimpleTest(){
        TwoSum obj = new TwoSum();

        int[] test1 = new int[]{2,7,11,15};
        int[] test2 = new int[]{3,2,4};
        int[] test3 = new int[]{3,3};

        Assertions.assertArrayEquals(new int[]{1,0}, obj.twoSum(test1, 9));
        Assertions.assertArrayEquals(new int[]{2,1}, obj.twoSum(test2, 6));
        Assertions.assertArrayEquals(new int[]{1,0}, obj.twoSum(test3, 6));
    }

}