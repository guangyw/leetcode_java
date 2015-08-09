import LeetCode.*;
import common.LinkedList;
import common.Tree;

public class Main {

    public static void main(String[] args) {
//        SumRange sr = new SumRange();
//        System.out.println(sr.summaryRanges(new int[] {0,1}));

//        ValiadPalindrome vp = new ValiadPalindrome();
//        System.out.println(vp.isPalindrome(",."));

//        LongestPalinDrome lpd = new LongestPalinDrome();
//        Tree.TreeNode root = Tree.BuildTree("0,1,2,#,4,5");
//        BinaryTreeLevelOrderTravesal btot = new BinaryTreeLevelOrderTravesal();
//        System.out.println(btot.levelOrder(root));
//        System.out.println(btot.levelOrderBFS(root));
//        System.out.println(lpd.longestPalindrome("aaaaa"));

//        ZigZag zz = new ZigZag();
//        System.out.println(zz.convert("ABC", 2));
//        ReverseLinkedList rll = new ReverseLinkedList();
//        System.out.println(rll.reverseListIterative(LinkedList.BuildList(new int[] {1, 2, 3})).toString());

//        System.out.println(rll.reverseBetween(LinkedList.BuildList(new int[] {1, 2, 3, 4, 5}), 2, 3).toString());
        MergeTwoSortedList mtsl = new MergeTwoSortedList();
        System.out.println(mtsl.mergeTwoList(LinkedList.BuildList(new int[] {1, 4, 5}), LinkedList.BuildList(new int[] {2, 3,4})));

    }
}

