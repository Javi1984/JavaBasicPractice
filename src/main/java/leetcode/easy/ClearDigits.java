package leetcode.easy;

import java.util.Stack;
import java.util.stream.Collectors;

public class ClearDigits {

    public String clearDigitsStr(String s){
        Stack<Character> strStack = new Stack<>();
        if(s.isEmpty()){
            return "";
        }
        for(int i =0; i< s.length(); i++){
            if( Character.isDigit(s.charAt(i))){
                strStack.pop();
            }else {
                strStack.push(s.charAt(i));
            }
        }
        return strStack.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
