package LeetCode;

import common.Tree.TreeNode;

import java.util.Stack;

/**
 * Created by guangyw on 8/9/15.
 */
public class BuildTreeFromInorderPostorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        int inIdx = len -1;
        int idx = len -1;
        if (inorder == null || postorder == null || len < 1) return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node;
        TreeNode root = new TreeNode(postorder[idx]);
        stack.push(root);
        idx--;
        while(idx >= 0) {
            if (inorder[inIdx] == stack.peek().val) {
                if (--inIdx < 0) break;
                node = stack.pop();
                if (!stack.isEmpty() && inorder[inIdx] == stack.peek().val) {
                    continue;
                }
                node.left = new TreeNode(postorder[idx]);
                stack.push(node.left);
            } else {
                node = stack.peek();
                node.right = new TreeNode(postorder[idx]);
                stack.push(node.right);
            }
            idx--;
        }
        return root;
    }
}
