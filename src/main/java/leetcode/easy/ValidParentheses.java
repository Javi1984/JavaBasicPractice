package leetcode.easy;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String x) {
        if(x.length() % 2 ==1){
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(char ch : x.toCharArray()){
          if(ch == '(' || ch == '{' || ch == '['){
              stack.push(ch);
          }else {
              if(stack.isEmpty()){
                  return false;
              }
              char top = stack.pop();
              if(ch == ')' && top != '('){
                  return false;
              }
              if(ch =='}' && top != '{'){
                  return false;
              }
              if(ch == ']' && top != '['){
                  return false;
              }
          }
        }
        return true;
    }
}
