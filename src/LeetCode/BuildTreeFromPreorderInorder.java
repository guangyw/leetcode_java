package LeetCode;

import common.Tree.TreeNode;

import java.util.Stack;

/**
 * Created by guangyw on 8/9/15.
 */
public class BuildTreeFromPreorderInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length < 1 || preorder.length != inorder.length) return null;
        int idx = 0;
        int inIdx = 0;
        TreeNode root = new TreeNode(preorder[idx]);
        TreeNode node;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        idx++;
        while(idx < preorder.length) {
            if (inorder[inIdx] == stack.peek().val) {
                if (inIdx++ >= preorder.length) break;
                node = stack.pop();
                if (!stack.isEmpty() && inorder[inIdx] == stack.peek().val) continue;
                node.right = new TreeNode(preorder[idx]);
                stack.push(node.right);
            } else {
                node = stack.peek();
                node.left = new TreeNode(preorder[idx]);
                stack.push(node.left);
            }
            idx++;
        }
        return root;
    }
}
