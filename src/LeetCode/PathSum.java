package LeetCode;

import common.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by guangyw on 7/13/15.
 */
public class PathSum {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSumII(TreeNode root, int sum) {
        Stack<Integer> stack = new Stack<>();
        if (root == null)  return res;
        pathSum(stack, root, sum);
        return res;
    }
    private void pathSum(Stack<Integer> stack, TreeNode node, int sum) {
        stack.push(node.val);
        if (node.left == null && node.right == null) {
            if (node.val == sum) {
                res.add(new ArrayList<Integer>(stack));
            }
        }
        if (node.left != null) pathSum(stack, node.left, sum - node.val);
        if (node.right != null) pathSum(stack, node.right, sum - node.val);
        stack.pop();
    }


    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.val == sum && root.left ==null && root.right == null) return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
