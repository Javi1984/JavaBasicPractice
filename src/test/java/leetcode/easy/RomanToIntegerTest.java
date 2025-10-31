package leetcode.easy;

import leetcode.easy.RomanToInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

    @Test
    void convertRomanStrToInt(){
        var romanToInt = new RomanToInteger();
        var result = romanToInt.convertRomanStrToInt("MCMXCIV");
        Assertions.assertEquals(1994, result);

        result =  romanToInt.convertRomanStrToInt("LVIII");
        Assertions.assertEquals(58, result);

        result =  romanToInt.convertRomanStrToInt("III");
        Assertions.assertEquals(3, result);
    }

}