package leetcode.easy;

public class ClimbingStairs {

    public int climb(int i) {
        int one = 1;
        int two = 1;
        int temp = 0;

        for(int x =0; x < i -1; x++){
            temp = one;
            one = one + two;
            two = temp;

        }
        return one;
    }
}
