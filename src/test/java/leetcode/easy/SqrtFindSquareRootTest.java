package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtFindSquareRootTest {

    SqrtFindSquareRoot obj;
    int x,y;

    @BeforeEach
    public void setup(){
        obj = new SqrtFindSquareRoot();
        x = 4;
        y = 8;
    }

    @Test
    public void testSimpleSquareRootSolution(){
        assertEquals(2,obj.findSquareRoot(x));
        assertEquals(2,obj.findSquareRoot(y));
    }

    @Test
    public void testBinSearchSqrRoot(){
        assertEquals(2,obj.binSearchSqrRoot(x));
        assertEquals(2,obj.binSearchSqrRoot(y));
    }

}