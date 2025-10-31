package leetcode.easy.SameTreeProblem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SameTreeTest {

    TreeNode p = new TreeNode(1,new TreeNode(2), new TreeNode(3));
    TreeNode q = new TreeNode(1,new TreeNode(2), new TreeNode(3));

    TreeNode x = new TreeNode(1);
    TreeNode y = new TreeNode(1, null, new TreeNode(2));

    TreeNode a = new TreeNode(1,new TreeNode(2), new TreeNode(1));
    TreeNode b = new TreeNode(1,new TreeNode(1), new TreeNode(2));

    SameTree obj = new SameTree();

    @Test
    void areTheseTreesTheSame(){

        Assertions.assertTrue(obj.isSameTree(p,q));
        Assertions.assertFalse(obj.isSameTree(x,y));
        Assertions.assertFalse(obj.isSameTree(a,b));
    }
}