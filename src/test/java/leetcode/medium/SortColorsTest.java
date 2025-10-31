package leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Given an array nums with n objects colored red, white, or blue, sort them
in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 */

class SortColorsTest {
    SortColors obj = new SortColors();
    @Test
    void sortColors(){
        int[] nums1 = {2,0,2,1,1,0};
        int[] nums2 = {2,0,1};

        int[] nums1Check = {0,0,1,1,2,2};
        int[] nums2Check = {0,1,2};

        obj.sortColors(nums1);
        obj.sortColors(nums2);

        Assertions.assertArrayEquals(nums1Check, nums1);
        Assertions.assertArrayEquals(nums2Check, nums2);
    }

}