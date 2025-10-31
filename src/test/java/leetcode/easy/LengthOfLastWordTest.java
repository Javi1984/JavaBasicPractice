package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    void lengthOfLastWord(){
        LengthOfLastWord obj = new LengthOfLastWord();
        String testStr = "  fly me   to   the moon  ";
        assertEquals(4, obj.lengthOfLastWord(testStr) );

        testStr = "fly me to the";
        assertEquals(3, obj.lengthOfLastWord(testStr) );

    }
}