package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    void testPlusOne(){
        PlusOne obj = new PlusOne();
        int[] test1 = {1,2,3};
        int[] test2 = {4,3,2,1};
        int[] test3 = {9};

        int[] answer1 = {1,2,4};
        int[] answer2 = {4,3,2,2};
        int[] answer3 = {1,0};

        assertArrayEquals(answer1, obj.plusOne(test1));
        assertArrayEquals(answer2, obj.plusOne(test2));
        assertArrayEquals(answer3, obj.plusOne(test3));
    }

}