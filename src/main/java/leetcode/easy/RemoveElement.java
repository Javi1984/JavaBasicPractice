package leetcode.easy;

import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int uniqueNums = 0;
        for(int i = 0; i<nums.length; i++){
            int check  =  i + 1;
            if(nums[i] == val && check < nums.length){
                //nums[i] = nums[i+1];
                do{

                }while(nums[i] == nums[check]);
            }else{
                uniqueNums++;
            }
        }

        System.out.println("Array: " + Arrays.toString(nums));
        return uniqueNums;
    }
}
