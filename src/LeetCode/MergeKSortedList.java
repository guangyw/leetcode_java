package LeetCode;

import common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by guangyw on 8/9/15.
 */
public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        if (lists.length == 1) return lists[0];
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        Queue<ListNode> pq = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode list : lists) {
            if (list != null) {
                pq.offer(list);
            }
        }
        while(!pq.isEmpty()) {
            ListNode node = pq.poll();
            cur.next = node;
            if (node.next != null) {
                pq.offer(node.next);
            }
            node.next = null;
            cur = cur.next;
        }
        return dummy.next;
    }
}
