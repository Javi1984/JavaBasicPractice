package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClearDigitsTest {

    @Test
    public void testClearDigitsMethod(){
        ClearDigits obj = new ClearDigits();
        String test1 = "abc";
        String test2 = "cb34";
        String test3 = "cb34T";

        assertEquals(test1, obj.clearDigitsStr(test1));
        assertEquals("", obj.clearDigitsStr(test2));
        assertEquals("T", obj.clearDigitsStr(test3));
    }

}