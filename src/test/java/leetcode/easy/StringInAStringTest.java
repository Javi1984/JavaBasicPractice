package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringInAStringTest {

    private StringInAString obj;
    private String hayStack;
    private String needle;

    private String hayStack2;
    private String needle2;

    @BeforeEach
    public void setup(){
        obj = new StringInAString();
        hayStack = "sadbutsad";
        needle = "sad";

        hayStack2 = "leetcode";
        needle2 = "leeto";
    }

    @Test
    public void testStringInsideAString(){
        assertEquals(0, obj.findOccurrenseOfString(hayStack, needle));
        assertEquals(-1, obj.findOccurrenseOfString(hayStack2, needle2));
    }

    @Test
    public void testHardWay(){
        assertEquals(0, obj.findNeedle(hayStack, needle));
        assertEquals(-1, obj.findNeedle(hayStack2, needle2));
    }


}