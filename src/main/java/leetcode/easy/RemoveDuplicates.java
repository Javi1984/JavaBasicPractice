package leetcode.easy;

import java.util.Arrays;

public class RemoveDuplicates {
    public int removeDups(int[] nums){

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return ++j;
    }
}
