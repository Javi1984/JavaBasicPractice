package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void testRemoveDups(){

        int[] nums1  = {0,0,1,1,1,2,2,3,3,4};
        int[] nums2  = {1,1,2};

        RemoveDuplicates obj = new RemoveDuplicates();

        int result = obj.removeDups(nums2);

        Assertions.assertEquals(2, result);

        result = obj.removeDups(nums1);

        Assertions.assertEquals(5, result);

    }

}