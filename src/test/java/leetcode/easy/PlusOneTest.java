package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    PlusOne obj;
    int[] test1;
    int[] test2;
    int[] test3;
    int[] test4;
    int[] test5;

    int[] answer1;
    int[] answer2;
    int[] answer3;
    int[] answer4;
    int[] answer5;

    @BeforeEach
    public void setup(){
        obj = new PlusOne();
        test1 = new int[]{1,2,3};
        test2 = new int[]{4,3,2,1};
        test3 = new int[]{9};
        test4 = new int[]{9,9};
        test5 = new int[]{8,9,9};

        answer1 = new int[]{1,2,4};
        answer2 = new int[]{4,3,2,2};
        answer3 = new int[]{1,0};
        answer4 = new int[]{1,0,0};
        answer5 = new int[]{9,0,0};
    }

    @Test
    void testPlusOne(){
        assertArrayEquals(answer1, obj.plusOne(test1));
        assertArrayEquals(answer2, obj.plusOne(test2));
        assertArrayEquals(answer3, obj.plusOne(test3));
    }

    @Test
    void testPlusOneV2(){
        assertArrayEquals(answer1, obj.plusOneV2(test1));
        assertArrayEquals(answer2, obj.plusOneV2(test2));
        assertArrayEquals(answer3, obj.plusOneV2(test3));
        assertArrayEquals(answer4, obj.plusOneV2(test4));
        assertArrayEquals(answer5, obj.plusOneV2(test5));
    }

}