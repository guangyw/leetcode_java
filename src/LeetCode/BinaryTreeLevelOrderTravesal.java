package LeetCode;

import common.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by guangyw on 7/4/15.
 */
public class BinaryTreeLevelOrderTravesal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        buildLevel(res, root, 0);
        return res;
    }

    public void buildLevel(List<List<Integer>> res, TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (res.size() == depth) {
            res.add(new LinkedList<Integer>());
        }
        res.get(depth).add(root.val);
        buildLevel(res, root.left, depth + 1);
        buildLevel(res, root.right, depth + 1);
    }

    public List<List<Integer>> levelOrderBFS(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> subList = new ArrayList<>();
            while (levelSize > 0) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                --levelSize;
                subList.add(node.val);
            }
            res.add(subList);

        }
        return res;
    }

}


