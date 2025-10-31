package leetcode.easy;

public class AddTwoBinary {

    public String addTwoBStrings(String a, String b) {
        int i = a.length() -1;
        int j = b.length() -1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += b.charAt(j--) - '0';
            }
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }

    private static String addTwoBStringsv2(String a, String b){
        // A: 11, B: 1
        String rtnString = "";

        int max = (a.length() > b.length())?  a.length() : b.length();

        for(int i = 0; i< max; i++){
            if(i <=a.length()){

            }
        }

        return rtnString;
    }
}
