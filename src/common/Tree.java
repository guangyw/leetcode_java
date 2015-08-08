package common;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Created by guangyw on 7/4/15.
 */
public class Tree {
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x) { val = x; }
    }

    public static TreeNode BuildTree(String flatTree) {
        if (flatTree == null || flatTree == "") {
            return null;
        }
        String[] treeNodeVal = flatTree.split(",");

        Map<Integer, TreeNode> map = new HashMap<>();
        map.put(0, new TreeNode(Integer.parseInt(treeNodeVal[0])));
        for (int i = 1; i < treeNodeVal.length; ++i) {
            if (!treeNodeVal[i].equals("#")) {
                map.put(i, new TreeNode(Integer.parseInt(treeNodeVal[i])));
            }
        }
        for(int i = 0; 2 * i + 1 < treeNodeVal.length; ++i) {
            if (map.containsKey(2 * i + 1)) {
                map.get(i).left = map.get(2 * i + 1);
            }
            if (map.containsKey(2 * i + 2)) {
                map.get(i).right = map.get(2 * i + 2);
            }
        }
        return map.get(0);
    }
}
