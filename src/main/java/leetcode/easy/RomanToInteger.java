package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
/*
       Symbol      value
       I           1
       V           5
       X           10
       L           50
       C           100
       D           500
       M           1000

       LVIII = 58
       MCMXCIV  = 1994
*/
public class RomanToInteger {

    public int convertRomanStrToInt(String x) {
        Map<Character, Integer> convMap = new HashMap<>();
        convMap.put('I', 1);
        convMap.put('V', 5);
        convMap.put('X', 10);
        convMap.put('L', 50);
        convMap.put('C', 100);
        convMap.put('D', 500);
        convMap.put('M', 1000);
        int val = 0;
        String str = x.toUpperCase();
        for(int i=0; i <= str.length()-1; i++){
            char currChar = str.charAt(i);
            if(i<str.length()-1){
                char futureChar = str.charAt(i+1);
                if(convMap.get(currChar) >= convMap.get(futureChar) ){
                    val += convMap.get(currChar);
                }else {
                    val +=  convMap.get(futureChar) - convMap.get(currChar);
                    i++;
                }
            }else{
                val += convMap.get(currChar);
            }
        }
        return val;
    }
}
