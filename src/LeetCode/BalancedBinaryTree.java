package LeetCode;

import common.Tree;
import common.Tree.TreeNode;


/**
 * Created by guangyw on 7/5/15.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        if ((Math.abs(leftDepth - rightDepth) <= 1) && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }
        return false;
    }

    public int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(depth(node.left), depth(node.right)) + 1;
    }

    public boolean isBalancedBottomUp(TreeNode root) {
        return (depthVal(root) != -1);
    }

    public int depthVal(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depthVal(node.left);
        if (left == -1) {
            return -1;
        }
        int right = depthVal(node.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}
