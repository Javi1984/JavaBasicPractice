package leetcode.easy;

import org.junit.jupiter.api.Test;
import java.util.List;

class PascalsTriangleTest {

    @Test
    public void testPascalsTriangleSolution(){
        PascalsTriangle obj = new PascalsTriangle();
        List<List<Integer>>  res = obj.generate(5);
        System.out.println(res);
    }
}