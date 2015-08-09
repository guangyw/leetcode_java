package LeetCode;

//A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
//
//        Return a deep copy of the list.

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    class RandomListNode {
        int label;
         RandomListNode next, random;
         RandomListNode(int x) { this.label = x; }
    };

    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode cur = head;
        RandomListNode dummy = new RandomListNode(-1);
        RandomListNode newCur = dummy;
        Map<RandomListNode, RandomListNode> m = new HashMap<>();
        while(cur != null) {
            newCur.next = new RandomListNode(cur.label);
            m.put(cur, newCur.next);
            cur = cur.next;
            newCur = newCur.next;
        }
        cur = head;
        newCur = dummy.next;
        while(cur != null) {
            newCur.random = m.get(cur.random);
            cur = cur.next;
            newCur = newCur.next;
        }

        return dummy.next;
    }
}
