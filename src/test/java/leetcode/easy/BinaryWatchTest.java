package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryWatchTest {

    List<String> testObj1 =
            new ArrayList<>(Arrays.asList("0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"));
    List<String> testObj2 =
            new ArrayList<>(Arrays.asList());

    @Test
    void basicBinaryWatchTest(){
        BinaryWatch obj = new BinaryWatch();
        List<String> rtnObj = obj.readBinaryWatch(1);
        Assertions.assertEquals(testObj1, rtnObj);

        rtnObj = obj.readBinaryWatch(9);
        Assertions.assertEquals(testObj2, rtnObj);
    }

}