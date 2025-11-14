package leetcode.easy;

public class SqrtFindSquareRoot {

    public int findSquareRoot(int x){
        if(x <2){
            return x;
        }
        int i = 2;

        while(i*i <= x){
            i += 1;
        }
        return i-1;
    }

    public int binSearchSqrRoot(int x){
        if(x <2){
            return x;
        }

        int left = 1, right = x/2;
        int mid, square = 0;
        while(left <= right){
            mid  = (left + right) /  2;
            square = mid*mid;

            if(square == x){
                return mid;
            }else if(square<x){
                left = mid +1;
            }else{
                right = mid -1;
            }
        }

        return right;
    }
}
