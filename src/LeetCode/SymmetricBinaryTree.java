package LeetCode;

import common.Tree;
import common.Tree.TreeNode;

import java.util.Stack;

/**
 * Created by guangyw on 7/5/15.
 */
public class SymmetricBinaryTree {
    public boolean isSymmetricRecursive(TreeNode root) {
        if (root == null) {
            return true;
        }
        return symmetricHelp(root.left, root.right);
    }

    public boolean symmetricHelp(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        return (left.val == right.val) && symmetricHelp(left.left, right.right) && symmetricHelp(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> s = new Stack<>();

        if (root.left != null) {
            if (root.right == null) {
                return false;
            }
            s.push(root.left);
            s.push(root.right);
        } else if (root.right != null) {
            return false;
        }
        while(!s.empty()) {
            TreeNode left = s.pop();
            TreeNode right = s.pop();
            if (left.val != right.val) {
                return false;
            }
            if (left.left != null) {
                if (right.right == null) {
                    return false;
                }
                s.push(left.left);
                s.push(right.right);
            } else if (right.right != null) {
                return false;
            }

            if (left.right != null) {
                if (right.left == null) {
                    return false;
                }
                s.push(left.right);
                s.push(right.left);
            } else if (right.left != null) {
                return false;
            }
        }
        return true;
    }
}
