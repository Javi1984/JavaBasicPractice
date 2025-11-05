package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    @Test
    void testValidParenthesis(){
        ValidParentheses obj = new ValidParentheses();

        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([])";

        Assertions.assertTrue(obj.isValid(test1));
        Assertions.assertTrue(obj.isValid(test2));
        Assertions.assertFalse(obj.isValid(test3));
        Assertions.assertTrue(obj.isValid(test4));
    }

}