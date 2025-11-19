package leetcode.easy;

public class PlusOne {

    public int[] plusOne(int[] digits){
        int max = digits.length-1;
        System.out.println("int i: " + max);
        if(digits[max] == 9){
            int[] temp = new int[digits.length +1];
            for(int i =0; i< digits.length; i++){
                temp[i] = digits[i];
            }
            temp[max] = 1;
            temp[max+1] = 0;
            return temp;
        }
        digits[max] = digits[max] +1;
        return digits;
    }

    public int[] plusOneV2(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
