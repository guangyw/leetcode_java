package LeetCode;

import common.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangyw on 8/9/15.
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        rightSide(root, res, 0);
        return res;
    }

    public void rightSide(TreeNode node, List<Integer> result, int level) {
        if (node == null) return;
        if (level == result.size()) {
            result.add(node.val);
        }
        rightSide(node.right, result, level + 1);
        rightSide(node.left, result, level + 1);
    }
}
