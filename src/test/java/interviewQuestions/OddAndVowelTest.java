package interviewQuestions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddAndVowelTest {
    @Test
    void testFindOddAndVowel(){
        OddAndVowel obj = new OddAndVowel();

        String[] strList = {"thE","cat","gym","dry"};
        int test = 2;
        Assertions.assertEquals(test,obj.solutionsFound(strList) );

    }


}