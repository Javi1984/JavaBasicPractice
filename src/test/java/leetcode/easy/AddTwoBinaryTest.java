package leetcode.easy;

import leetcode.easy.AddTwoBinary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoBinaryTest {

    @Test
    void addTwoBStrings(){
        var addBinary = new AddTwoBinary();

        assertEquals("10101", addBinary.addTwoBStrings("1010","1011"));
        assertEquals("100", addBinary.addTwoBStrings("11","1"));
    }
}